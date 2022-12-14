package com.example.smartconnectify

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.smartconnectify.databinding.ActivitySignInBinding
import com.example.smartconnectify.userConst.getUsers
import com.example.smartconnectify.userConst.thisUser
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthCredential
import com.google.firebase.auth.GoogleAuthProvider

class SignInActivity : AppCompatActivity() {
    lateinit var binding : ActivitySignInBinding
    lateinit var firebaseAuth : FirebaseAuth
    lateinit var gso : GoogleSignInOptions
    lateinit var gsc : GoogleSignInClient
    override fun onCreate(savedInstanceState: Bundle?) {
        gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build()
        gsc = GoogleSignIn.getClient(this, gso)
        firebaseAuth = FirebaseAuth.getInstance()
        binding=ActivitySignInBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Sign In button Activity
        binding.signInButotn.setOnClickListener{
            val email = binding.emailInput.text.toString()
            val password = binding.passwordInput.text.toString()
            if(email.isNotEmpty() && password.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if(it.isSuccessful){
                        for( i in getUsers()){
                            if(i.Email==email){
                                thisUser=i
                            }
                        }
                        val i = Intent(this, MainActivity::class.java)
                        startActivity(i)
                        overridePendingTransition(
                            com.google.android.material.R.anim.abc_fade_in,
                            com.google.android.material.R.anim.abc_fade_out)
                        finish()
                    }
                    else{
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else{
                Toast.makeText(this, "Invalid Details", Toast.LENGTH_SHORT).show()
            }
        }

        //Sign in with google activity
        binding.googleSignIn.setOnClickListener{
            signInGoogle()
        }

//        Activity of clicking sign up button
        binding.signUpButton.setOnClickListener {
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in,
                com.google.android.material.R.anim.abc_fade_out)
        }
    }

    //google sign in function
    private fun signInGoogle(){
        val signinIntent = gsc.signInIntent
        launcher.launch(signinIntent)
    }


    //Launcher Function
    private val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result ->
                if(result.resultCode== Activity.RESULT_OK){
                    val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
                    handleResults(task)
                }
    }


    //Handleing Results function
    private fun handleResults(task: Task<GoogleSignInAccount>) {
        if(task.isSuccessful){
            val account : GoogleSignInAccount? = task.result
            if(account != null){
                updateUI(account)
            }
        }
        else{
            Toast.makeText(this, task.exception.toString(), Toast.LENGTH_SHORT).show()
        }
    }


    //Function for updating the final UI
    private fun updateUI(account: GoogleSignInAccount) {
        val credentials = GoogleAuthProvider.getCredential(account.idToken,null)
        firebaseAuth.signInWithCredential(credentials).addOnCompleteListener {
            if(it.isSuccessful){
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                overridePendingTransition(
                    androidx.appcompat.R.anim.abc_fade_in, androidx.constraintlayout.widget.R.anim.abc_fade_out)
            }
            else{
                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
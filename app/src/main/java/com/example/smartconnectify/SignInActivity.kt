package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.smartconnectify.databinding.ActivitySignInBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth

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
}
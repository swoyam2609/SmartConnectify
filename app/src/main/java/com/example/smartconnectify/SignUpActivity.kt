package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.smartconnectify.databinding.ActivitySignUpBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    lateinit var binding : ActivitySignUpBinding
    lateinit var firebaseAuth : FirebaseAuth
    lateinit var gso : GoogleSignInOptions
    lateinit var gsc : GoogleSignInClient
    override fun onCreate(savedInstanceState: Bundle?) {
        gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build()
        gsc = GoogleSignIn.getClient(this, gso)
        firebaseAuth = FirebaseAuth.getInstance()
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            val email = binding.emailInput.text.toString()
            val password = binding.passInput.text.toString()
            val confPassword = binding.confirmPassInput.text.toString()
            if(email.isNotEmpty() && password.isNotEmpty() && confPassword.isNotEmpty()){
                if(password!=confPassword){
                    Toast.makeText(this, "Password Mismatch", Toast.LENGTH_SHORT).show()
                }
                else{
                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, SignInActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                }
            }
        }
    }
}
package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivitySignUpSignInBinding

class SignUpSignInActivity : AppCompatActivity() {
    lateinit var binding : ActivitySignUpSignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpSignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //clicking on sign in button
        binding.signInButotn.setOnClickListener {
            val i = Intent(this, SignInActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in,
                com.google.android.material.R.anim.abc_fade_out)
        }

        //clicking on sign up button
        binding.signUpButotn.setOnClickListener {
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in,
                com.google.android.material.R.anim.abc_fade_out)
        }
    }
}
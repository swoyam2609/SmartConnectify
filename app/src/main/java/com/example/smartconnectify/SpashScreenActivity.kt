package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivitySpashScreenBinding

class SpashScreenActivity : AppCompatActivity() {
    lateinit var binding : ActivitySpashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.appIcon.alpha=0f

        //Animating the app opening animation
        binding.appIcon.animate().setDuration(2000).alpha(1f).withEndAction{
            val i = Intent(this, StartPageActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in,
                com.google.android.material.R.anim.abc_fade_out)
            finish()
        }
    }
}
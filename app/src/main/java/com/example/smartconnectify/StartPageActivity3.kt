package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.smartconnectify.databinding.ActivityStartPage3Binding
import com.example.smartconnectify.databinding.ActivityStartPageBinding
import java.util.*
import kotlin.concurrent.schedule

class StartPageActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityStartPage3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        //Setting trhe first image and thgen changing the background image at regular intervals
        binding.bgDocImage.setImageResource(R.drawable.doc3)

        //Next button clicking activity
        binding.nextButton.setOnClickListener {
            val i = Intent(this, SignUpSignInActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in,
                com.google.android.material.R.anim.abc_fade_out)
            finish()
        }

        //skip button clicking activity
        binding.skipButton.setOnClickListener {
            val i = Intent(this, SignUpSignInActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in,
                com.google.android.material.R.anim.abc_fade_out)
            finish()
        }
    }
}
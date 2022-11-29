package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.smartconnectify.databinding.ActivityStartPageBinding
import java.util.*
import kotlin.concurrent.schedule

class StartPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Array of the doctor advertisement images
        val imageArray = arrayListOf<Int>(R.drawable.doc1,R.drawable.doc2,R.drawable.doc3)

        //Setting trhe first image and thgen changing the background image at regular intervals
        binding.bgDocImage.setImageResource(imageArray[1])
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[0])
        }, 3000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[1])
        }, 6000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[2])
        }, 9000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[0])
        }, 12000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[1])
        }, 15000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[2])
        }, 18000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[0])
        }, 27000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[1])
        }, 30000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[2])
        }, 33000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[0])
        }, 36000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[1])
        }, 39000)
        handler.postDelayed({
            binding.bgDocImage.setImageResource(imageArray[2])
        }, 42000)

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
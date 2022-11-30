package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityPastappointmentsBinding

class pastappointments : AppCompatActivity() {
    lateinit var binding : ActivityPastappointmentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPastappointmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.upcomingApp.setOnClickListener {
            val i = Intent(this, Appointments::class.java)
            startActivity(i)
            overridePendingTransition(com.google.android.material.R.anim.abc_fade_out, com.google.android.material.R.anim.abc_fade_in)
            finish()
        }

        binding.backButtonAppoint.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(com.google.android.material.R.anim.abc_fade_out, com.google.android.material.R.anim.abc_fade_in)
            finish()
        }
    }
}
package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityCareBinding

class CareActivity : AppCompatActivity() {
    lateinit var binding : ActivityCareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCareBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.myAppointment.setOnClickListener {
            val i = Intent(this, Appointments::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in, com.google.android.material.R.anim.abc_fade_out
            )
        }


    }
}
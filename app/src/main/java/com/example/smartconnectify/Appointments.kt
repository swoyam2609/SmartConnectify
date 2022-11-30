package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityAppointmentsBinding

class Appointments : AppCompatActivity() {
    lateinit var binding:ActivityAppointmentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppointmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rbpast.setOnClickListener {
            val i = Intent(this, pastappointments::class.java)
            startActivity(i)
            overridePendingTransition(com.google.android.material.R.anim.abc_fade_out, com.google.android.material.R.anim.abc_fade_in)
        }

    }
}
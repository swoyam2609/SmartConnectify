package com.example.smartconnectify

import android.content.Intent
import android.net.Uri
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

        binding.backButtonAppoint.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(com.google.android.material.R.anim.abc_fade_out, com.google.android.material.R.anim.abc_fade_in)
            finish()
        }

        binding.call1.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL);
            val number = 7608086659
            intent.data = Uri.parse("tel:7608086659")
            startActivity(intent)
        }

        binding.call2.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL);
            val number = 9827117988
            intent.data = Uri.parse("tel:7608086659")
            startActivity(intent)
        }

    }
}
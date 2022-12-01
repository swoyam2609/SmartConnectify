package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityDoctorConsultationBinding

class DoctorConsultationActivity : AppCompatActivity() {
    lateinit var binding : ActivityDoctorConsultationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoctorConsultationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButtonAppoint.setOnClickListener {
            val i = Intent(this, CareActivity::class.java)
            startActivity(i)
            overridePendingTransition(com.google.android.material.R.anim.abc_fade_in, com.google.android.material.R.anim.abc_fade_out)
            finish()
        }
    }
}
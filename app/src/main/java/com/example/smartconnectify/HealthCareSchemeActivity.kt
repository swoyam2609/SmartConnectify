package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityHealthCareSchemeBinding

class HealthCareSchemeActivity : AppCompatActivity() {
    lateinit var binding : ActivityHealthCareSchemeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHealthCareSchemeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButtonAppoint.setOnClickListener {
            val i = Intent(this, CommunityActivity::class.java)
            startActivity(i)
            overridePendingTransition(com.google.android.material.R.anim.abc_fade_in, com.google.android.material.R.anim.abc_fade_out)
            finish()
        }
    }
}
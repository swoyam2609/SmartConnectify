package com.example.smartconnectify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityHospitalNearbyBinding

class HospitalNearbyActivity : AppCompatActivity() {
    lateinit var binding : ActivityHospitalNearbyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHospitalNearbyBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
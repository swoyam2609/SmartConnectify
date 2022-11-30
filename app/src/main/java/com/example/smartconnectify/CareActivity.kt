package com.example.smartconnectify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityCareBinding

class CareActivity : AppCompatActivity() {
    lateinit var binding : ActivityCareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCareBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
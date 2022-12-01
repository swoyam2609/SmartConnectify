package com.example.smartconnectify

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityHospitalNearbyBinding

class HospitalNearbyActivity : AppCompatActivity() {
    lateinit var binding : ActivityHospitalNearbyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHospitalNearbyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sumLoc.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://goo.gl/maps/twHbJAiooEsPtZBL9")
            startActivity(openURL)
        }

        binding.amriLoc.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://goo.gl/maps/awH8Zajd2kEWhYnG6")
            startActivity(openURL)
        }

        binding.aiimsLoc.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://goo.gl/maps/SwYCpunYXSAjN3ZHA")
            startActivity(openURL)
        }

        binding.apoloLoc.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://goo.gl/maps/ZuBh9uCaqCseuFQT9")
            startActivity(openURL)
        }
    }
}
package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityProfileBinding
import com.example.smartconnectify.userConst.thisUser

class ProfileActivity : AppCompatActivity() {
    lateinit var binding : ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        thisUser?.photo?.let { binding.dislplayPicture.setImageResource(it) }
        binding.userName.text= thisUser?.name
        binding.phoneNumber.text= thisUser?.phone
        binding.dateBirth.text= thisUser?.DOB

        binding.homeIcon.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in, com.google.android.material.R.anim.abc_fade_out
            )
            finish()
        }

        binding.careIcon.setOnClickListener {
            val i = Intent(this, CareActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in, com.google.android.material.R.anim.abc_fade_out
            )
            finish()
        }

        binding.communityIcon.setOnClickListener {
            val i = Intent(this, CommunityActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in, com.google.android.material.R.anim.abc_fade_out
            )
            finish()
        }


    }
}
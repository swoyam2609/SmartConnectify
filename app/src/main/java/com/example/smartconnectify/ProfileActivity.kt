package com.example.smartconnectify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityProfileBinding
import com.example.smartconnectify.userConst.thisUser
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity : AppCompatActivity() {
    lateinit var binding : ActivityProfileBinding
    lateinit var firebaseAuth : FirebaseAuth
    lateinit var gso : GoogleSignInOptions
    lateinit var gsc : GoogleSignInClient
    override fun onCreate(savedInstanceState: Bundle?) {
        gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build()
        gsc = GoogleSignIn.getClient(this, gso)
        firebaseAuth = FirebaseAuth.getInstance()
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

        binding.healthCareScheme.setOnClickListener {
            val i = Intent(this, HealthCareSchemeActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in, com.google.android.material.R.anim.abc_fade_out
            )
        }

        binding.logOutButton.setOnClickListener {
            firebaseAuth.signOut()
            val i = Intent(this, SignUpSignInActivity::class.java)
            startActivity(i)
            overridePendingTransition(
                com.google.android.material.R.anim.abc_fade_in, com.google.android.material.R.anim.abc_fade_out
            )
            finish()
        }


    }
}
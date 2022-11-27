package com.example.smartconnectify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartconnectify.databinding.ActivityStartPageBinding

class StartPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageArray = arrayListOf<Int>(R.drawable.doc1,R.drawable.doc2,R.drawable.doc3)
        var i =0
        binding.bgDocImage.setImageResource(imageArray[i])
        binding.bgDocImage.alpha=0f
        while(true){
            binding.bgDocImage.animate().setDuration(2000).alpha(1f).withEndAction{
                i++
            }
            if(i==3){
                i=0
            }
            binding.bgDocImage.setImageResource(imageArray[i])
        }
    }
}
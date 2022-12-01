package com.example.smartconnectify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.smartconnectify.databinding.ActivityBmiactivityBinding
import java.math.RoundingMode

class BMIActivity : AppCompatActivity() {
    lateinit var binding : ActivityBmiactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compute.setOnClickListener {
            val check : Boolean = binding.height.text.toString().isNotEmpty() && binding.weight.text.toString().isNotEmpty()
            if(check){
                var heightInput : Double = binding.height.text.toString().toDouble()/100.0
                var weightInput : Double = binding.weight.text.toString().toDouble()
                binding.result.text = (weightInput / (heightInput * heightInput)).toBigDecimal().setScale(2, RoundingMode.FLOOR).toString()
            }
            else{
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
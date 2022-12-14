package com.turgutkurt.androidcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.turgutkurt.androidcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var val1 :Int ? =null
    var val2 :Int ? =null
    var sum :Int ? =null
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun mySum(view:View){
        val1 = binding.editTextNumber.text.toString().toIntOrNull()
        val2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (val1== null || val2==null){
            binding.resultText.text="Hata!"
        }else{
            sum =  val1!!+val2!!
            binding.resultText.text = sum.toString()
        }
    }

    fun mySub(view:View){
        val1 = binding.editTextNumber.text.toString().toIntOrNull()
        val2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (val1== null || val2==null){
            binding.resultText.text="Hata!"
        }else{
            sum =  val1!!-val2!!
            binding.resultText.text = sum.toString()
        }
    }

    fun myMultiply(view:View){
        val1 = binding.editTextNumber.text.toString().toIntOrNull()
        val2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (val1== null || val2==null){
            binding.resultText.text="Hata!"
        }else{
            sum =  val1!!*val2!!
            binding.resultText.text = sum.toString()
        }
    }

    fun myDiv(view:View){
        val1 = binding.editTextNumber.text.toString().toIntOrNull()
        val2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (val1== null || val2==null){
            binding.resultText.text="Hata!"
        }else{
            sum =  val1!!/val2!!
            binding.resultText.text = sum.toString()
        }
    }
}

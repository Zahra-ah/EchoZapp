package com.example.echozapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.echozapp.databinding.ActivityDonateBinding

class donate : AppCompatActivity() {
    private var totalAmountt: Double = 0.0

    lateinit var binding:ActivityDonateBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
  binding=ActivityDonateBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        addCallBack()
        donation()
    }

    private fun  addCallBack()
    {
        binding.donateArrow.setOnClickListener()
        {
            finish()
        }
    }

    fun donation(){
    binding.donateButton.setOnClickListener(){
        val amount=binding.donationAmount.text.toString()
        if (!TextUtils.isEmpty(amount))
        {
            val amountt = amount.toDouble()
         totalAmountt += amountt
          binding.totalAmount.setText(totalAmountt.toString())

        }
        else
        {
            binding.totalAmount.setText("invalid amount")
        }
       // val total_amount=binding.totalAmount.text.toString()
    }
}
}
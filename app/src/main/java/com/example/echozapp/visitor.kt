package com.example.echozapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.echozapp.databinding.ActivityVisitorBinding

class visitor : AppCompatActivity() {
    lateinit var binding: ActivityVisitorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityVisitorBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        callReasons()
        callResults()
        callSolutions()
        phoneCall()
        callDonate()
        callBack()
    }
    fun callBack()
    {
       binding.visitorArrow.setOnClickListener()
       {
           finish()

       }

    }
    fun callReasons()
    {

        binding.button7.setOnClickListener()
        {

            val intent = Intent(this,reasons::class.java)
            startActivity(intent)
        }
    }

    fun callResults()
    {

        binding.button8.setOnClickListener()
        {

            val intent = Intent(this,results::class.java)
            startActivity(intent)
        }
    }

    fun callSolutions()
    {

        binding.button9.setOnClickListener()
        {

            val intent = Intent(this,solutions::class.java)
            startActivity(intent)
        }
    }
    private  fun phoneCall()
    {
        binding.button11.setOnClickListener()
        {

            val intent= Intent(Intent.ACTION_DIAL)
            val phoneNumber:String="012458033567"
            intent.data= Uri.parse("tel:$phoneNumber")
            startActivity(intent)
        }
    }
    private fun callDonate()
    {

        binding.button10.setOnClickListener()
        {

            val intent = Intent(this,donate::class.java)
            startActivity(intent)
        }
    }
}
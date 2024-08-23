package com.example.echozapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.echozapp.databinding.ActivityResultsBinding

class results : AppCompatActivity() {
    lateinit var binding:ActivityResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityResultsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        addCallBack()
    }

    fun   addCallBack()
    {
        binding.textView27.setOnClickListener()
        {
            finish()
        }

    }
}
package com.example.echozapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.echozapp.databinding.ActivityContactBinding

class contact : AppCompatActivity() {
    lateinit var binding:ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityContactBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

    }

}
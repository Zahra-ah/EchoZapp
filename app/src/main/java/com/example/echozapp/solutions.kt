package com.example.echozapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.echozapp.databinding.ActivitySolutionsBinding

class solutions : AppCompatActivity() {
    lateinit var binding: ActivitySolutionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivitySolutionsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        addCallback()
    }
    private  fun     addCallback()
    {

        binding.textView32.setOnClickListener()
        {
            finish()
        }
    }
}
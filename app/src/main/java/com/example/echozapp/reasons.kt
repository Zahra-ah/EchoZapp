package com.example.echozapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.echozapp.databinding.ActivityReasonsBinding

class reasons : AppCompatActivity() {
    lateinit var binding:ActivityReasonsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityReasonsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        addCallBack()

    }

  fun   addCallBack()
    {
        binding.textView28.setOnClickListener()
        {
            finish()
        }

    }
}
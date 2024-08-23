package com.example.echozapp

import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.echozapp.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        addCallSIGNUP()
        addCallLOGIN()

    }


    private fun addCallSIGNUP()
    {
        binding.button2.setOnClickListener{
         val intent= Intent(this,signup::class.java)
            startActivity(intent)

        }
    }
    private fun addCallLOGIN()
    {
        binding.button.setOnClickListener()
        {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)

        }
    }


}
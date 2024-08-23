package com.example.echozapp

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.echozapp.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    val data=signup()
    var listUser= arrayListOf<save>()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        addCallBack()
        addCallNext()
    }

    private fun addCallBack()
    {
        binding.arrowlogin.setOnClickListener()
        {
            finish()
        }
    }

    private fun addCallNext()
    {

        binding.button6.setOnClickListener()
        {
            var Email=binding.editTextTextEmailAddress2.text.toString()
            var pass=binding.editTextTextPassword.text.toString()
            if(!TextUtils.isEmpty(Email)&&!TextUtils.isEmpty(pass))
            {
          IntenT()
            }

        }
    }
    private fun IntenT()
    {
        val intent = Intent(this, visitor::class.java)
        startActivity(intent)
    }

//    private fun Data1()
//    {
//       var Email=binding.editTextTextEmailAddress2
//        var pass=binding.editTextTextPassword
//    }
//
//    private fun addCall(){
//        Data1()
//        addCallNext()
//
//    }
}
package com.example.echozapp
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.text.TextUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File
import com.example.echozapp.databinding.ActivitySignupBinding
class signup : AppCompatActivity() {


    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivitySignupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
     addBack()
//     addCallActivity()
        addNewUser()
    }
    private fun  addBack() {
   binding.arrowSign.setOnClickListener{
    finish()
   }

   }
    var ListOfUsers= arrayListOf<newuser>()
    private fun  addNewUser() {


        binding.button3.setOnClickListener {
            var name = binding.editTextText.text.toString()
            var email = binding.editTextTextEmailAddress.text.toString()
            var pass = binding.editTextNumberPassword.text.toString()
            var new = newuser(name, email, pass)
            ListOfUsers.add(new)
            if (!TextUtils.isEmpty(new.name) && !TextUtils.isEmpty(new.email) && !TextUtils.isEmpty(new.password))
            {
                IntenT()
                }

            }
        }

//    private fun addCallActivity()
//    {
//        binding.button3.setOnClickListener{
//
//            addNewUser()
//
//        }
//
//    }
    private fun IntenT()
    {
        val intent = Intent(this, visitor::class.java)
        startActivity(intent)
    }
}


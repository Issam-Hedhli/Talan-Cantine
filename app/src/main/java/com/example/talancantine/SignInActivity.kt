package com.example.talancantine

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.talancantine.databinding.ActivitySignInBinding
import com.google.android.material.button.MaterialButton

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_sign_in)
        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password)
        val loginbtn = findViewById<MaterialButton>(R.id.loginbtn)

        //admin and admin

        loginbtn.setOnClickListener {

                if(username.text.toString()=="admin" && password.text.toString()=="admin"){
                    //correct
                    Toast.makeText(this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,AdminInterface::class.java))
                    }
                else
                    //incorrect
                    Toast.makeText(this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show()
            }
    }
}
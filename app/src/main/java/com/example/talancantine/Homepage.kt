package com.example.talancantine

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.talancantine.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.signIn.setOnClickListener {
            startActivity(Intent(this,SignInActivity::class.java))
        }

        binding.signUp.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

    }
}
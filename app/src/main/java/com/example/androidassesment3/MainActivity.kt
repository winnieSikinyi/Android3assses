package com.example.androidassesment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import javax.accessibility.AccessibleKeyBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    overridefun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

override fun onResume() {
    super.onResume()
    displayContact()
    binding.btnSignup.setOnClickListener {
        val intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}

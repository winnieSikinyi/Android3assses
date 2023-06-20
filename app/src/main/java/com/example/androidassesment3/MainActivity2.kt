package com.example.androidassesment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidassesment3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
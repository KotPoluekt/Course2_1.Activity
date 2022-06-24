package com.tomato.course2_1activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tomato.course2_1activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.setOnClickListener {

        }
        binding.btn2.setOnClickListener {

        }
        binding.btn3.setOnClickListener {

        }
    }
}
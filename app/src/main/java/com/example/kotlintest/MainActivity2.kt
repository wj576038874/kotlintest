package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate

class MainActivity2 : AppCompatActivity() {

    private val myVIewModel by viewModels<MyVIewModel>()
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button = findViewById(R.id.btn)

        button.setOnClickListener {
            myVIewModel.asd("222222")
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }

        myVIewModel.intData.observe(this){
            Log.e("asd" , it)
        }
    }
}
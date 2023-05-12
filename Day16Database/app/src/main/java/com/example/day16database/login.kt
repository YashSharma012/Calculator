package com.example.day16database

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnSignup= findViewById<Button>(R.id.btnSignup)

        btnSignup.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.example.day16database

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference  // added
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername= findViewById<TextInputEditText>(R.id.etUsername)
        val etMail= findViewById<TextInputEditText>(R.id.etMail)
        val etPassword= findViewById<TextInputEditText>(R.id.etPassword)
        val btnSignup = findViewById<Button>(R.id.btnCreateAccount)
        val btnSignin = findViewById<Button>(R.id.btnLogin)

        btnSignup.setOnClickListener {
            val username = etUsername.text.toString()
            val mail = etMail.text.toString()
            val password = etPassword.text.toString()

            val user = User(username,mail,password)
            database = FirebaseDatabase.getInstance().getReference("Users")
            database.child(username).setValue(user).addOnSuccessListener {
                Toast.makeText(this, "User Registered Successfully", Toast.LENGTH_SHORT).show()
            }.addOnSuccessListener {
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
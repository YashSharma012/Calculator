package com.example.responsivelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.widget.addTextChangedListener
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainLayout = findViewById<LinearLayout>(R.id.mainLayout)
        val imageView = findViewById<ImageView>(R.id.imageView);
        val emailId = findViewById<TextInputEditText>(R.id.emailEdT)
        val password = findViewById<TextInputEditText>(R.id.passwordEdT)
        imageView.setImageDrawable(getDrawable(R.drawable.start))
        emailId.addTextChangedListener {
            Glide.with(this).load(R.drawable.email).into(imageView)
        }
        emailId.add

        password.addTextChangedListener {
            Glide.with(this).load(R.drawable.password).into(imageView)
        }
    }
}
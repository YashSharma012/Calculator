package com.example.mycafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val KEY = "com.example.mycafe.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val ordersPlaced= et1.text.toString() + ", " + et2.text.toString() + ", " + et3.text.toString() + ", " + et4.text.toString()
            intent= Intent(this,Orders::class.java)
            intent.putExtra(KEY, ordersPlaced)
            startActivity(intent)
        }
    }
}

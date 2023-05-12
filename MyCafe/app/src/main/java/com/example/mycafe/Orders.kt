package com.example.mycafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_orders.*

class Orders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        val ordersOfCustomers= intent.getStringExtra(MainActivity.KEY)

        tVOrders.text= ordersOfCustomers.toString()
    }
}
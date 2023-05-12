package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var isNewOp = true
    var oldNumber = ""
    var operator = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.editTextNumber.showSoftInputOnFocus = false  // To not open the soft keyboard

    }

    fun numberEvent(view: View) {
        if(isNewOp)
            binding.editTextNumber.setText("")
        isNewOp = false
        var btnClick = binding.editTextNumber.text.toString()
        var btnSelect = view as Button
        when(btnSelect.id){
            binding.btn1.id -> {btnClick += "1"}
            binding.btn2.id -> {btnClick += "2"}
            binding.btn3.id -> {btnClick += "3"}
            binding.btn4.id -> {btnClick += "4"}
            binding.btn5.id -> {btnClick += "5"}
            binding.btn6.id -> {btnClick += "6"}
            binding.btn7.id -> {btnClick += "7"}
            binding.btn8.id -> {btnClick += "8"}
            binding.btn9.id -> {btnClick += "9"}
            binding.btn0.id -> {btnClick += "0"}
            binding.btnDot.id -> {btnClick += "."}
            binding.btnPlusMinus.id -> {btnClick = "-$btnClick"}
        }
        binding.editTextNumber.setText(btnClick)
    }

    fun operatorEvent(view: View) {
        isNewOp = true
        oldNumber = binding.editTextNumber.text.toString()
        var op = view as Button
        when(op.id){
            binding.btnPlus.id -> {operator = "+"}
            binding.btnMinus.id -> {operator = "-"}
            binding.btnMul.id -> {operator = "*"}
            binding.btnDivide.id -> {operator = "/"}
        }
    }

    fun equalEvent(view: View) {
        var newNumber = binding.editTextNumber.text.toString()
        var result = 0.0
        when(operator){
            "+" -> {result = oldNumber.toDouble() + newNumber.toDouble()}
            "-" -> {result = oldNumber.toDouble() - newNumber.toDouble()}
            "*" -> {result = oldNumber.toDouble() * newNumber.toDouble()}
            "/" -> {result = oldNumber.toDouble() / newNumber.toDouble()}
        }
        binding.editTextNumber.setText(result.toString())
    }

    fun acEvent(view: View) {
        binding.editTextNumber.setText("")
        isNewOp = true
    }
}
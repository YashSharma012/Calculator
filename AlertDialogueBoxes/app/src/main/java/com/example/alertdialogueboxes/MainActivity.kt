package com.example.alertdialogueboxes

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogueboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you want to exit?")
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed when the button is clicked
                finish()
            })

            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed when the button is clicked
            })
            builder1.show()
        }

        binding.button2.setOnClickListener {
            val options = arrayOf("Apple", "Orange", "Mango", "Grapes")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite Fruit?")
            builder2.setSingleChoiceItems(options,0, DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed after user clicks on any option
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                finish()
            })

            builder2.setNegativeButton("Decline" , DialogInterface.OnClickListener { dialog, which ->

            })
            builder2.show()
        }

        binding.button3.setOnClickListener {
            val options = arrayOf("Apple", "Orange", "Mango", "Grapes")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which are your favourite fruits?")
            builder3.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "${options[which]} selected", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->  })
            builder3.show()
        }
    }
}
package com.example.AlertDialogueBoxes

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.AlertDialogueBoxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are You Sure?")
            builder1.setMessage("Do you want to exit?")
            builder1.setIcon(R.drawable.ic_baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed after clicking the button
                finish()
            })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed after clicking the button
            })

            builder1.show()
        }

        binding.button2.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rashmalai", "Kaju Katli")
            var builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                //what action should be performed when user clicks on any option
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed after clicking the button
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed after clicking the button
            })
            builder2.show()
        }

        binding.button3.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rashmalai", "Kaju Katli")
            var builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed after clicking the button
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialog, which ->
                //What action should be performed after clicking the button
            })
            builder2.show()
        }
    }
}
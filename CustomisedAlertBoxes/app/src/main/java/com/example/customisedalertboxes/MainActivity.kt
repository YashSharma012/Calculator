package com.example.customisedalertboxes

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.customisedalertboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var dialog : Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_alertbox_ui)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        //Creating variable for custom_alertbox_ui.xml
        var btnGood = dialog.findViewById<Button>(R.id.btnGood)
        var btnFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        btnGood.setOnClickListener {
            dialog.dismiss()
        }

        btnFeedback.setOnClickListener {

        }

        binding.button.setOnClickListener {
            dialog.show()
        }
    }
}

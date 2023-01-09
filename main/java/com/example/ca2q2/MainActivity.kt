package com.example.ca2q2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s1: Spinner = findViewById(R.id.spinner1)
        val s2: Spinner = findViewById(R.id.spinner2)
        val bt: Button = findViewById(R.id.button2)

        ArrayAdapter.createFromResource(
            this,
            R.array.Pickup,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            s1.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this,
            R.array.Time,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            s2.adapter = adapter
        }
        bt.setOnClickListener {
            if (s1.selectedItem == "Pickup Location" || s2.selectedItem == "Estimated Pickup Time") {
                Toast.makeText(this, "Please fill oin the details.", Toast.LENGTH_SHORT).show()
            } else {
                val intent1 = Intent(this, MainActivity2::class.java)
                startActivity(intent1)
            }
        }
    }
}
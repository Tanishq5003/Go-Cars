package com.example.ca2q2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var i = intent.extras
        var model = i?.getString("Model").toString()

        val nm : EditText = findViewById(R.id.editTextTextPersonName2)
        val ph : EditText = findViewById(R.id.editTextPhone)
        val mail : EditText = findViewById(R.id.editTextTextEmailAddress2)
        val btn : Button = findViewById(R.id.button)
        var txt : TextView = findViewById(R.id.textView)
        txt.text = "Model Selected : "+model

        btn.setOnClickListener {
            if (nm.text.toString()==""||ph.text.toString()==""||mail.text.toString()==""){
                Toast.makeText(this, "Please fill in the details", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Your booking is confirmed.", Toast.LENGTH_SHORT).show()
                Toast.makeText(this, "Our representative will call you shortly.", Toast.LENGTH_SHORT).show()
                val intent1 = Intent(this,MainActivity::class.java)
                startActivity(intent1)
            }
        }
    }
}
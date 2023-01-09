package com.example.ca2q2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bt1:Button = findViewById(R.id.buttonDzire)
        val bt2:Button = findViewById(R.id.buttonSwift)
        val bt3:Button = findViewById(R.id.buttonBaleno)
        val bt4:Button = findViewById(R.id.buttonStingRay)
        val bt5:Button = findViewById(R.id.buttonI20)

        bt1.setOnClickListener {
            val intent1 = Intent(this,MainActivity3::class.java)
            intent1.putExtra("Model" , "Dzire")
            startActivity(intent1)
        }

        bt2.setOnClickListener {
            val intent1 = Intent(this,MainActivity3::class.java)
            intent1.putExtra("Model" , "Swift")
            startActivity(intent1)
        }
        bt3.setOnClickListener {
            val intent1 = Intent(this,MainActivity3::class.java)
            intent1.putExtra("Model" , "Baleno")
            startActivity(intent1)
        }
        bt4.setOnClickListener {
            val intent1 = Intent(this,MainActivity3::class.java)
            intent1.putExtra("Model" , "StingRay")
            startActivity(intent1)
        }
        bt5.setOnClickListener {
            val intent1 = Intent(this,MainActivity3::class.java)
            intent1.putExtra("Model" , "i20")
            startActivity(intent1)
        }
    }
}
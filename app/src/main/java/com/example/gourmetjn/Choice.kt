package com.example.gourmetjn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Choice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        val btnBf = findViewById<Button>(R.id.btnBf)
        val btnLun = findViewById<Button>(R.id.btnLun)
        val btnDin = findViewById<Button>(R.id.btnDin)

        btnBf.setOnClickListener(){
            startActivity(Intent(this@Choice, Bf1::class.java))
        }
        btnLun.setOnClickListener(){
            startActivity(Intent(this@Choice, Lun1::class.java))
        }
        btnDin.setOnClickListener(){
            startActivity(Intent(this@Choice, Dinn1::class.java))
        }
    }
}
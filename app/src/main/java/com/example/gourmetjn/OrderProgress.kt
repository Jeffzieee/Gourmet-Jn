package com.example.gourmetjn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class OrderProgress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_progress)
        Toast.makeText(applicationContext, "Meal on the Way !!", Toast.LENGTH_SHORT).show();

        val btnCont = findViewById<Button>(R.id.btnCont)

        btnCont.setOnClickListener(){
            startActivity(Intent(this@OrderProgress, Choice::class.java))
        }


    }
}
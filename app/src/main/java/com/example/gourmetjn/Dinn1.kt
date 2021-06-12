package com.example.gourmetjn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Dinn1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinn1)
        val btnPizza = findViewById<ImageButton>(R.id.btnPizza)
        val btnPor = findViewById<ImageButton>(R.id.btnPor)

        btnPizza.setOnClickListener(){
            startActivity(Intent(this@Dinn1, OrderProgress::class.java))
        }

        btnPor.setOnClickListener(){
            startActivity(Intent(this@Dinn1, OrderProgress::class.java))
        }
    }
}
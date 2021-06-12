package com.example.gourmetjn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Bf1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bf1)
        val btnIdli = findViewById<ImageButton>(R.id.btnIdli)
        val btnDosa = findViewById<ImageButton>(R.id.btnDosa)

        btnIdli.setOnClickListener(){
            startActivity(Intent(this@Bf1, OrderProgress::class.java))
        }

        btnDosa.setOnClickListener(){
            startActivity(Intent(this@Bf1, OrderProgress::class.java))
        }
    }
}
package com.example.gourmetjn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Lun1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lun1)
        val btnVeg = findViewById<ImageButton>(R.id.btnVeg)
        val btnBir = findViewById<ImageButton>(R.id.btnBir)

        btnVeg.setOnClickListener(){
            startActivity(Intent(this@Lun1, OrderProgress::class.java))
        }

        btnBir.setOnClickListener(){
            startActivity(Intent(this@Lun1, OrderProgress::class.java))
        }
    }
}
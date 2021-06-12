package com.example.gourmetjn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val btnJump = findViewById<Button>(R.id.btnJump)
        btnJump.setOnClickListener(){
            startActivity(Intent(this@Welcome, Login::class.java))
        }

    }
}
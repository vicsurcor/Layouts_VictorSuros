package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var botonNext: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonNext = findViewById(R.id.botonInferior)
        botonNext.setOnClickListener {
            val intent = Intent(this, Linear_Layout::class.java)
            startActivity(intent)
        }
    }
}
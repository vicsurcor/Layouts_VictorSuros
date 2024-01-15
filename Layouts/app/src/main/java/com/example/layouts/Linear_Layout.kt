package com.example.layouts

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Linear_Layout: AppCompatActivity() {
    private lateinit var correo:EditText;
    private lateinit var contrasena: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_act2)

        correo = findViewById(R.id.correo)
        contrasena = findViewById(R.id.contrasena)

        fun clearFieldOnFocusChange(v: View, hasFocus: Boolean) {
            if (hasFocus) {

                (v as EditText).apply {

                    text.clear();

                }
            }
        }
        val fields = listOf(correo, contrasena)
        fields.forEach { it.setOnFocusChangeListener(::clearFieldOnFocusChange)
    }
    }
}

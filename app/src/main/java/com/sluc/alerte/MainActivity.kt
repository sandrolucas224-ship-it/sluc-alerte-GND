package com.sluc.alerte

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAlert = findViewById<Button>(R.id.btn_alert)
        btnAlert.setOnClickListener {
            Toast.makeText(this, "🔔 ALERTE: N'oublie pas de boire de l'eau", Toast.LENGTH_LONG).show()
        }
    }
}
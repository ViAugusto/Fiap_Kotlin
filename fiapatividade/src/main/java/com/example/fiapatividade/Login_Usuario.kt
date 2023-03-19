package com.example.fiapatividade

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login_Usuario: AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiap_login)

        val cadastroButton = findViewById<Button>(R.id.cadastro_button)
        cadastroButton.setOnClickListener {
            val intent = Intent(this, Cadastro_Usuario::class.java)
            startActivity(intent)

        }
    }
}
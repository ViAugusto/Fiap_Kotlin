package com.example.fiapatividade

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cadastro_Usuario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiap_cadastro)

        // TODO: Exemplo de pegar valor de um campo
        //val username = findViewById<EditText>(R.id.username)
        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            val loginTela = Intent(this, Login_Usuario::class.java)
            startActivity(loginTela)

        }

    }
}


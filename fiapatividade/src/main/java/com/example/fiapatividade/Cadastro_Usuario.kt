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
        setContentView(R.layout.activity_fiap_login)

        //val username = findViewById<EditText>(R.id.username)
        //val password = findViewById<EditText>(R.id.password)
        val myButton = findViewById<Button>(R.id.login_portugues)
        //val botao = Button("Apertar")
        myButton.setOnClickListener {

            //Toast.makeText(this, "Botão encontrado!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Login_Usuario::class.java)
            startActivity(intent)

        }

    }
}


package com.example.saudacaoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val btnenviar =   findViewById<Button>(R.id.btn_enviar)

        btnenviar.setOnClickListener{

        mostrar()

        }


    }
    fun mostrar() {

        val edtnome =   findViewById<EditText>(R.id.edt_nome)
        val edtemail =   findViewById<EditText>(R.id.edt_email)
        val edtcpf =   findViewById<EditText>(R.id.edt_cpf)
        val edtidade =   findViewById<EditText>(R.id.edt_idade)
        val txt_result = findViewById<TextView>(R.id.txt_result)
        txt_result.setText("nome: ${edtnome.toString()}\n Idade: ${edtidade.toString()} \n Email: ${edtemail} \n cpf: ${edtcpf}")
    }
}
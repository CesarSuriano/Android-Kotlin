package com.example.cesar.testes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById(R.id.botao) as Button
        val botao2 = findViewById(R.id.botao2) as Button
        val texto = findViewById(R.id.hello) as TextView

        botao.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                texto.setText("Teste")
            }
        })

        botao2.setOnClickListener { view -> texto.setText("Teste 2") }

    }
}

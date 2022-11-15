package com.example.apbailar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apbailar.databinding.ActivityAcademiaBinding
import com.example.apbailar.databinding.ActivityPersonaBinding

class Academia : AppCompatActivity() {

    private lateinit var union: ActivityAcademiaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        union = ActivityAcademiaBinding.inflate(layoutInflater)
        setContentView(union.root)

        union.academiaBtnRegresar.setOnClickListener(this::volver)
        union.ingresar.setOnClickListener(this::irIngreso)
        union.registro.setOnClickListener(this::irRegistro)
    }

    private fun volver (view: View){
        val intentoVol = Intent(this, MainActivity::class.java)
        startActivity(intentoVol)
    }

    private fun irIngreso (view: View){
        val intentoIngreso = Intent(this, Ingreso::class.java)
        startActivity(intentoIngreso)
    }

    private fun irRegistro (view: View){
        val intentoRegistro = Intent(this, Registro::class.java)
        startActivity(intentoRegistro)
    }
}
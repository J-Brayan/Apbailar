package com.example.apbailar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apbailar.databinding.ActivityAcademiaBinding
import com.example.apbailar.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {

    private lateinit var union: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        union = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(union.root)

        union.academiaBtnRegresarRegistro.setOnClickListener(this::volver)
        union.academiaBtnRegresarRegistro.setOnClickListener(this::irIngreso)

    }

    private fun volver (view: View){
        val intentoVol = Intent(this, Academia::class.java)
        startActivity(intentoVol)
    }

    private fun irIngreso (view: View){
        val intentoIngreso = Intent(this, Ingreso::class.java)
        startActivity(intentoIngreso)
    }
}
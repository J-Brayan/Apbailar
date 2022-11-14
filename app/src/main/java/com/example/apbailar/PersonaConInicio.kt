package com.example.apbailar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apbailar.databinding.ActivityPersonaBinding
import com.example.apbailar.databinding.ActivityPersonaConInicioBinding

class PersonaConInicio : AppCompatActivity() {

    private lateinit var union: ActivityPersonaConInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        union = ActivityPersonaConInicioBinding.inflate(layoutInflater)
        setContentView(union.root)

        union.conVolver.setOnClickListener(this::volver)
    }

    private fun volver (view: View){
        val intentoVol = Intent(this, Persona::class.java)
        startActivity(intentoVol)
    }
}
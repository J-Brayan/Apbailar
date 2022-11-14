package com.example.apbailar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apbailar.databinding.ActivityMainBinding
import com.example.apbailar.databinding.ActivityPersonaBinding

class Persona : AppCompatActivity() {

    private lateinit var union: ActivityPersonaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        union = ActivityPersonaBinding.inflate(layoutInflater)
        setContentView(union.root)

        union.personaBtnRegresar.setOnClickListener(this::volver)
        union.personaCon.setOnClickListener(this::conExp)
        union.personaSin.setOnClickListener(this::sinExp)

    }

    private fun volver (view: View){
        val intentoIni = Intent(this, MainActivity::class.java)
        startActivity(intentoIni)
    }

    private fun conExp (view: View){
        val intentoCon = Intent(this, PersonaConInicio::class.java)
        startActivity(intentoCon)
    }

    private fun sinExp (view: View){
        val intentoSin = Intent(this, PersonaSinInicio::class.java)
        startActivity(intentoSin)
    }
}
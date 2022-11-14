package com.example.apbailar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apbailar.databinding.ActivityPersonaBinding
import com.example.apbailar.databinding.ActivityPersonaSinInicioBinding

class PersonaSinInicio : AppCompatActivity() {

    private lateinit var union: ActivityPersonaSinInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        union = ActivityPersonaSinInicioBinding.inflate(layoutInflater)
        setContentView(union.root)

        union.sinVolver.setOnClickListener(this::voler)
    }

    private fun voler (view: View){
        val intentoVol = Intent(this, Persona::class.java)
        startActivity(intentoVol)
    }
}
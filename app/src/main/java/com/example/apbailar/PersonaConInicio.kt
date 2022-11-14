package com.example.apbailar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apbailar.databinding.ActivityPersonaBinding
import com.example.apbailar.databinding.ActivityPersonaConInicioBinding

class PersonaConInicio : AppCompatActivity() {

    private lateinit var union: ActivityPersonaConInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persona_con_inicio)

        union = ActivityPersonaConInicioBinding.inflate(layoutInflater)
        setContentView(union.root)

    }
}
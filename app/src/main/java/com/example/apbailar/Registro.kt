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

    }

    private fun volver (view: View){
        val intentoVol = Intent(this, Academia::class.java)
        startActivity(intentoVol)
    }
}
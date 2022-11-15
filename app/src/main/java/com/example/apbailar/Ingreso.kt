package com.example.apbailar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apbailar.databinding.ActivityIngresoBinding
import com.example.apbailar.databinding.ActivityRegistroBinding

class Ingreso : AppCompatActivity() {

    private lateinit var union: ActivityIngresoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        union = ActivityIngresoBinding.inflate(layoutInflater)
        setContentView(union.root)

        union.academiaBtnRegresarIngreso.setOnClickListener(this::volver)
    }

    private fun volver (view: View){
        val intentoVol = Intent(this, Academia::class.java)
        startActivity(intentoVol)
    }

    private fun ingresar (view: View, id: Int, clave: String){

    }
}
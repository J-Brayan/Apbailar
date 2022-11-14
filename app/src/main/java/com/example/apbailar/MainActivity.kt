package com.example.apbailar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.core.content.ContextCompat.startActivity
import com.bumptech.glide.Glide
import com.example.apbailar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var union: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        union = ActivityMainBinding.inflate(layoutInflater)
        setContentView(union.root)


        reproGif()

        union.salir.setOnClickListener(this::salir)
        union.irPersona.setOnClickListener(this::irPersona)
        union.irAcademia.setOnClickListener(this::irAcademia)
    }

    private fun reproGif (){
        val imagenMovi:ImageView = findViewById(R.id.dinamicLogo)
        Glide.with(this).load(R.drawable.iconmov).into(imagenMovi)
    }
    private fun salir (view: View){
        finishAffinity()
    }

    private fun irPersona (view: View){
        val intento = Intent(this, Persona::class.java)
        startActivity(intento)
    }

    private fun irAcademia (view: View){
        val intento = Intent(this, Academia::class.java)
        startActivity(intento)
    }
}
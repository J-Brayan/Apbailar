package com.example.apbailar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apbailar.databinding.ActivityAcademiaBinding
import com.example.apbailar.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {

    private lateinit var union: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        union = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(union.root)
    }
}
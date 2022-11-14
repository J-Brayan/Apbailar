package com.example.apbailar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apbailar.databinding.ActivityPersonaBinding

class Academia : AppCompatActivity() {

    private lateinit var union: ActivityPersonaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        union = ActivityPersonaBinding.inflate(layoutInflater)
        setContentView(union.root)
    }

    private fun volver (view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
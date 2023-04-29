package com.abyan.a10120209latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Login : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMasuk : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnMasuk = findViewById(R.id.btnCheckCode)

        btnMasuk.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnCheckCode ->{
                val intentMasuk = Intent(this@Login,Biodata::class.java)
                startActivity(intentMasuk)
            }
        }
    }
}
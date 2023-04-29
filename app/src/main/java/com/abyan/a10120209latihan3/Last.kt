package com.abyan.a10120209latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Last : AppCompatActivity() {
    private lateinit var textNama : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        textNama = findViewById(R.id.txtDoneTitle)

        val namaUser = intent.getStringExtra("nama")

        textNama.text = "Beres! Sekarang "+namaUser+" udah bisa ngecek penggunaan Hp mu tiap hari buat bantu kamu ngatur waktu :)"
    }
}
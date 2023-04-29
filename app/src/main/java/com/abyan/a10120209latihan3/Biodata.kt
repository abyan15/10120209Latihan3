package com.abyan.a10120209latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Biodata : AppCompatActivity() {

    private lateinit var editBiodata : EditText
    private lateinit var btnSend : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        btnSend = findViewById(R.id.btnBiodataNext)
        editBiodata = findViewById(R.id.edtBiodataName)
        btnSend.setOnClickListener {
            startActivity(Intent(this@Biodata,Last::class.java)
                .putExtra("nama",editBiodata.text.toString()))
        }
    }
}
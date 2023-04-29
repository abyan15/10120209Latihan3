package com.abyan.a10120209latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

//29 April 2023, latihan 3, 10120209, Abyan Altoriandi Yazid, IF6
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnStart =findViewById(R.id.btnWalkthroughStart)

    btnStart.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnWalkthroughStart ->{
                val intentStart = Intent(this@MainActivity,Login::class.java)
                startActivity(intentStart)
            }
        }
    }
}
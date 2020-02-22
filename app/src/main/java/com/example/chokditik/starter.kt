package com.example.chokditik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_starter.*

class starter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)
        btnmp.setOnClickListener {
            var gm=Intent(baseContext,MainActivity::class.java)
            startActivity(gm)
        }
        imageView.setOnClickListener { startActivity(Intent(baseContext,about::class.java)) }
    }
}

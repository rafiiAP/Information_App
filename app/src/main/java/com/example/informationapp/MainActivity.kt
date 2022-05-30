package com.example.informationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBtn.setOnClickListener{
            val pindah = Intent (this, ResultActivity::class.java)
            pindah.putExtra("name", nametext.text.toString())
            pindah.putExtra("age", numtext.text.toString())
            startActivity(pindah)
        }

    }
}
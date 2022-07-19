package com.example.liquidconversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        c_button.setOnClickListener {
            val intent = Intent(this, Convert:: class.java)

            startActivity(intent)
        }
    }
}
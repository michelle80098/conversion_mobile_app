package com.example.liquidconversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Convert : AppCompatActivity() {

    private lateinit var input : EditText

    private lateinit var output : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert)
        val gm_button = findViewById<Button>(R.id.gm_button)
        val mg_button = findViewById<Button>(R.id.mg_button)

        gm_button.setOnClickListener { convert_gm() }
        mg_button.setOnClickListener { convert_mg() }

        input = findViewById(R.id.input)
        output = findViewById(R.id.output)
    }

    private fun convert_gm() {
        try {
            val gal = input.text.toString().toFloat()
            val ml = (gal * 3785f)
            output.text = "${"%.2f" .format(ml)} mL"
        } catch (e : Exception) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()
        }

    }

    private fun convert_mg() {
        try {
            val ml = input.text.toString().toFloat()
            val gal = (ml / 3785f)
            output.text = "${"%.4f" .format(gal)} gal"
        } catch (e : Exception) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()
        }
    }
}
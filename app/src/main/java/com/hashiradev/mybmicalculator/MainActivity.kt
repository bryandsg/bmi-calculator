package com.hashiradev.mybmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)
        setListeners()
    }

    private fun setListeners() {
        val heightET = findViewById<EditText>(R.id.heightET)
        val weightET = findViewById<EditText>(R.id.weightET)


        val calcBtn = findViewById<Button>(R.id.calcBtn)

        calcBtn?.setOnClickListener {
            calculateBMI(heightET.text.toString(), weightET.text.toString())
        }
    }

    private fun calculateBMI(heightTxt: String, weightTxt: String) {
        val height = heightTxt.toFloatOrNull()
        val weight = weightTxt.toFloatOrNull()
        val title = findViewById<TextView>(R.id.titleScreen)
        val bmi: Float

        if ( height != null && weight != null ) {
            bmi = weight / (height * height)
            title.text = "Your BMI is: \n %.2f".format(bmi)
        }
    }
}
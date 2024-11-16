package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val counter = findViewById<TextView>(R.id.counter)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            number++
            counter.text = number.toString()
            Log.d("ClicksCounter", "Button was pressed $number times")
        }

        button.setOnLongClickListener{
            number = 0
            counter.text = number.toString()
            Log.d("Reset Clicks", "Button was long-pressed. Counter reset")
            true
        }
    }
}
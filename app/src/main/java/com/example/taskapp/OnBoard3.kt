package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Button
import android.widget.TextView

class OnBoard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board3)

        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
        var textView5 = findViewById<TextView>(R.id.textView5)
        textView5.setOnClickListener {
            var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }
    }
}
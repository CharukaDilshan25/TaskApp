package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.taskapp.fragments.HomeFragment
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        var textView11 = findViewById<TextView>(R.id.textView11)
        textView11.setOnClickListener {
            var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }
    }
}
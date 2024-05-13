package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.taskapp.fragments.HomeFragment

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var button5 = findViewById<ImageView>(R.id.button5)
        button5.setOnClickListener {
            var intent = Intent(this, HomeFragment::class.java)
            startActivity(intent)
            finish()
        }
    }
}
package com.example.taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import android.widget.Button
import android.widget.TextView

class OnBoard2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board2)


        var imageView7 = findViewById<ImageView>(R.id.imageView7)
        imageView7.setOnClickListener {
            var intent = Intent(this, OnBoard3::class.java)
            startActivity(intent)
            finish()
        }
        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
        var textView3 = findViewById<TextView>(R.id.textView3)
        textView3.setOnClickListener {
            var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }
    }
}
package com.example.easyeats

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var button1 = findViewById<Button>(R.id.logout)
        button1.setOnClickListener{
            val intent1= Intent(this, login::class.java)
            startActivity(intent1)


        }


        var button2 = findViewById<Button>(R.id.delete)
        button2.setOnClickListener{
            val intent1= Intent(this, signup::class.java)
            startActivity(intent1)


        }


    }
}
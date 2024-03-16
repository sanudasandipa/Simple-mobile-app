package com.example.easyeats

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var button2 = findViewById<TextView>(R.id.submit1)
        button2.setOnClickListener{
            val intent1= Intent(this, home::class.java)
            startActivity(intent1)


        }

        var button3 = findViewById<TextView>(R.id.createaccount)
        button3.setOnClickListener{
            val intent1= Intent(this, signup::class.java)
            startActivity(intent1)


        }


    }
}
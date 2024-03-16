package com.example.easyeats

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var button1 = findViewById<Button>(R.id.next2)
        button1.setOnClickListener{
            val intent1= Intent(this, page4::class.java)
            startActivity(intent1)


        }


        var button2 = findViewById<Button>(R.id.skip)
        button2.setOnClickListener{
            val intent1= Intent(this, signup::class.java)
            startActivity(intent1)


        }

    }
}
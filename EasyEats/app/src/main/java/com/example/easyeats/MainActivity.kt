package com.example.easyeats

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        // Delay in milliseconds before switching to the next activity
        val delayMillis: Long = 2000 // 5000 milliseconds = 5 seconds

        Handler().postDelayed({
            startNextActivity()
        }, delayMillis)
    }

    private fun startNextActivity() {
        val intent1 = Intent(this, page2::class.java)
        startActivity(intent1)
        finish() // Optional: finish current activity if you don't want to go back
    }
}

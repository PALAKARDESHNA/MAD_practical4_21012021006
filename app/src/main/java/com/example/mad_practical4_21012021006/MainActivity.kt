package com.example.mad_practical4_21012021006

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mad_practical4_21012021006.R.id.button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<View>(R.id.button3)
        button.setOnClickListener {
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
    }
}
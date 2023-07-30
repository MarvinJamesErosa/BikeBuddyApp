package com.example.bikebuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backButton: AppCompatButton = findViewById(R.id.backAbout)
        backButton.setOnClickListener {
            onBackPressed() // Handle the back button click to go back to the previous screen (fragment)
        }
    }

    override fun onBackPressed() {
        finish() // Finish the About activity to return to the previous fragment (Account fragment)
    }
}
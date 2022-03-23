package com.bitdev.project3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WorldActivity : AppCompatActivity() {

    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world)

        backButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }

    }
}
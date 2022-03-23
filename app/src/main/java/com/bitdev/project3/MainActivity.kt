package com.bitdev.project3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var helloButton : Button
    private lateinit var changeTitleButton: Button
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloButton = findViewById(R.id.button_hello)
        helloButton.setOnClickListener {
            val intent = Intent(this, WorldActivity::class.java)
            startActivity(intent)
        }

        changeTitleButton = findViewById(R.id.change_title)
        changeTitleButton.setOnClickListener {
            randomTitle()
        }
    }

    fun randomTitle(){
        var title = ""
        when(Random.nextInt(1, 5)){
            1 -> title = "Hello World!"
            2 -> title = "Hello Planet!"
            3 -> title = "Hello Galaxy"
            4 -> title = "Hey!!"
            5 -> title = "Hello Friend!"
        }

        this.title = title
    }
}
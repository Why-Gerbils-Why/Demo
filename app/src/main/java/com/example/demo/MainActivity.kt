package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var mGreeting: Button
    private lateinit var mGoodbyeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mGoodbyeButton=findViewById(R.id.goodbye_button)
        mGreeting=findViewById(R.id.greeting)

        mGoodbyeButton.setOnClickListener{
            mGoodbyeButton.visibility = View.INVISIBLE
            mGreeting.visibility = View.INVISIBLE
        }
    }
}
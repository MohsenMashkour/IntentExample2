package com.mkrdeveloper.intentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val txtRes = findViewById<TextView>(R.id.textView)

        val intent = getIntent()

        val name = intent.getStringExtra("Name")
        val age = intent.getIntExtra("Age", 0)
        val chBoxState = intent.getBooleanExtra("State",false)

        txtRes.text = "collected data \n\nname: "+name+"\nage: "+age+"\nstate: "+chBoxState
    }
}
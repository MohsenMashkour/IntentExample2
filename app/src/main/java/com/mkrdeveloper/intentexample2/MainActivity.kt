package com.mkrdeveloper.intentexample2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSend = findViewById<Button>(R.id.button)
        val edtName = findViewById<EditText>(R.id.edtName)
        val edtAge = findViewById<EditText>(R.id.edtAge)
        val chBox = findViewById<CheckBox>(R.id.checkBox)

        var chBoxState = false

        chBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) chBoxState = true
            if (!isChecked) chBoxState = false
        }

        btnSend.setOnClickListener {
            val name = edtName.text.toString()
            val age = edtAge.text.toString().toInt()

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("Name", name)
            intent.putExtra("Age", age)
            intent.putExtra("State", chBoxState)

            startActivity(intent)

        }
    }
}
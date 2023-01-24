package com.example.t

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.jar.Attributes.Name


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnButton : Button= findViewById(R.id.btnButton)
        val Name : EditText = findViewById(R.id.Name)
        val Surname : EditText = findViewById(R.id.Surname)
        val DOB : EditText = findViewById(R.id.BOD)


        btnButton.setOnClickListener{
            if(Name.text.isEmpty() )
                Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }





    }
}
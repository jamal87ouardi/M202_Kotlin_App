package com.example.m202_poo_ecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val resultat = intent.getDoubleExtra("price",0.0)

        val txtRes = findViewById<TextView>(R.id.resultat)

        txtRes.setText("prix total : $resultat")

    }
}
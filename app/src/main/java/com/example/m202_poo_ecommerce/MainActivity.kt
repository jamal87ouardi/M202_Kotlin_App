package com.example.m202_poo_ecommerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.calc)

        btn.setOnClickListener {

            val rbi5 = findViewById<RadioButton>(R.id.i5)

            val swAcc = findViewById<Switch>(R.id.accessoires)

            val qtEdit = findViewById<EditText>(R.id.quantite).text.toString()

            var price = 0.0

            val quantite = qtEdit.toInt()


            if(rbi5.isChecked) {
                price=3500.0*quantite
            }
            else {
                price = 5100.0*quantite
            }

            if(swAcc.isChecked) price += 350.0


            val i = Intent(this,MainActivity2::class.java)
            i.putExtra("price",price)
            startActivity(i)

        }





    }
}
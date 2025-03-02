package com.example.name2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

  private lateinit var edt1:Button
  private lateinit var edt2:Button
  private lateinit var edt3:Button
  private lateinit var edt4:Button
  private lateinit var edt5:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        edt3 = findViewById(R.id.edt3)
        edt4 = findViewById(R.id.edt4)
        edt5 = findViewById(R.id.edt5)


      edt1.setOnClickListener{

          val intent1 = Intent(this@MainActivity,Ascreen::class.java)
          startActivity(intent1)

      }

        edt2.setOnClickListener{

            val intent2 = Intent(this@MainActivity,RScreen::class.java)
            startActivity(intent2)
        }

        edt3.setOnClickListener {

            val intent3 = Intent(this@MainActivity, PScreen::class.java)
            startActivity(intent3)
        }
        edt4.setOnClickListener {

            val intent4 = Intent(this@MainActivity, IScreen::class.java)
            startActivity(intent4)
        }

        edt5.setOnClickListener {

            val intent5 = Intent(this@MainActivity, TScreen::class.java)
            startActivity(intent5)

        }
    }
}




package com.nkodem.sort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.dzialamy).setOnClickListener {
            val start = Date().time
            //Thread.sleep(1000)
            val koniec = Date().time
            findViewById<TextView>(R.id.textView2).setText((koniec-start).toString())
        }
        findViewById<Button>(R.id.exit).setOnClickListener {
            finish()
        }
    }
}
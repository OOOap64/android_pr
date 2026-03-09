package com.example.networksapplication
import android.app.Activity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
//import constraintlayout.widget.ConstraintLayout
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.networksapplication.databinding.ActivityMainBinding
import com.example.networksapplication.databinding.ActivityMainBinding.inflate
import android.R.attr.onClick
import android.util.Log.v
import androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding
//    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)


    var btn4: Button = findViewById(R.id.btn4)
    var btn3: Button = findViewById(R.id.btn3)
    var tv2: TextView = findViewById(R.id.tv2)
    if (btn3 != null) {
        btn3.setOnClickListener {
            var i = tv2.text.toString().toLong()//toString();
            i += 1
            tv2.text = i.toString()
        }
    }
    if (btn4 != null) {
        btn4.setOnClickListener {
            var i = tv2.text.toString().toLong()//toString();
            i -= 1
            tv2.text = i.toString()
        }
    }

    enableEdgeToEdge()
    setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        insets

    }
}}


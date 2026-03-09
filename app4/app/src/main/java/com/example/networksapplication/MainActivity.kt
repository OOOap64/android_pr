package com.example.networksapplication
import android.app.Activity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.RadioButton
import android.widget.CheckBox
import android.widget.TextView
import com.example.networksapplication.R
//import constraintlayout.widget.ConstraintLayout
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rd1: RadioButton = findViewById(R.id.rd1)
        var btn3: Button = findViewById(R.id.btn3)
        var rd2: RadioButton = findViewById(R.id.rd2)
        var cb1:CheckBox =findViewById(R.id.cb1)
        var cb2:CheckBox =findViewById(R.id.cb2)
        var cb3:CheckBox =findViewById(R.id.cb3)
        var cb4:CheckBox =findViewById(R.id.cb4)
        var tv2:TextView =findViewById(R.id.tv2)
        var status : String = "Status"
        tv2.text="Status"

        if (cb1.isChecked){
            status=status+" Swimming"
        }
        if (cb2.isChecked){
            status=status+" Tenis"
        }
        if (cb3.isChecked){
            status=status+" Basketball"
        }
        if (cb4.isChecked){
            status=status+" Football"
        }
        if (rd1.isChecked){
            status=status+"\nGender: Male"
        } else if (rd2.isChecked) {
            status=status+"\nGender: Female"
        }
        if (btn3 != null) {
            btn3.setOnClickListener {
                var b = rd2.isChecked
                System.out.println(b)
                tv2.text=status
            }
        }
        enableEdgeToEdge()
    }
}


package com.example.module_2_lesson_3_hw_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//remove UP BAR
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
//remove TITLE BAR
//        supportActionBar?.hide()

        setContentView(R.layout.activity_main)





    }
}
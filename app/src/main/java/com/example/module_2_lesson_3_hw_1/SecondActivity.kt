package com.example.module_2_lesson_3_hw_1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val obtainedColor = intent.getStringExtra(Enums.COLOR)
        val obtainedText = intent.getStringExtra(Enums.TEXT)

        clSecondActivity.setBackgroundColor(Color.parseColor(obtainedColor))
        tvText.text = obtainedText

    }
}
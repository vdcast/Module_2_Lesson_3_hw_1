package com.example.module_2_lesson_3_hw_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//remove UP BAR
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
//remove TITLE BAR
//        supportActionBar?.hide()

        setContentView(R.layout.activity_main)

        btColor1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Enums.COLOR, "#ffffff")
            intent.putExtra(Enums.TEXT,"White")
            startActivity(intent)
        }
        btColor2.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(Enums.COLOR, "#DD0000")
            intent.putExtra(Enums.TEXT,"Red")
            startActivity(intent)
        }
        btColor3.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(Enums.COLOR,"#0080ff")
            intent.putExtra(Enums.TEXT,"Blue")
            startActivity(intent)
        }
        btColor4.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(Enums.COLOR,"#37EC00")
            intent.putExtra(Enums.TEXT,"Green")
            startActivity(intent)
        }
        btColor5.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(Enums.COLOR,"#00FFFF")
            intent.putExtra(Enums.TEXT,"Cyan")
            startActivity(intent)
        }
        btColor6.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(Enums.COLOR,"#D3D3D3")
            intent.putExtra(Enums.TEXT,"Gray")
            startActivity(intent)
        }
        btColor7.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(Enums.COLOR,"#FF00FF")
            intent.putExtra(Enums.TEXT,"Magenta")
            startActivity(intent)
        }

    }
}
package com.example.viewpagertest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        buttonSlide.setOnClickListener {
            startActivity(Intent(this, SlideActivity::class.java))
        }

        buttonRotation.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
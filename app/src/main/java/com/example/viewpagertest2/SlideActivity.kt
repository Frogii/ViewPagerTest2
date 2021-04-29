package com.example.viewpagertest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_slide.*

class SlideActivity : AppCompatActivity() {

    lateinit var myPagerAdapter: MyPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide)

        myPagerAdapter = MyPagerAdapter()
        viewPagerSlide.adapter = myPagerAdapter
        Glide.with(this@SlideActivity).load(R.drawable.motorcycle_3).into(imageViewSlide)

        viewPagerSlide.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })
    }
}
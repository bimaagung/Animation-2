package com.otetcode.animation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //configuration anim
        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(this, R.anim.stb)
        val btt1 = AnimationUtils.loadAnimation(this, R.anim.btt1)
        val btt2 = AnimationUtils.loadAnimation(this, R.anim.btt2)
        val btt3 = AnimationUtils.loadAnimation(this, R.anim.btt3)
        val btt_follow = AnimationUtils.loadAnimation(this, R.anim.btt_follow)

        //configurasi id
        val title = findViewById(R.id.title) as TextView
        val desc = findViewById(R.id.desc) as TextView
        val icon_utama = findViewById(R.id.icon_utama) as ImageView
        val icon1 = findViewById(R.id.icon1) as ImageView
        val icon2 = findViewById(R.id.icon2) as ImageView
        val icon3 = findViewById(R.id.icon3) as ImageView
        val tbFollow = findViewById(R.id.tbFollow) as Button

        //connect obeject to animation
        title.startAnimation(ttb)
        desc.startAnimation(ttb)
        icon_utama.startAnimation(stb)
        icon1.startAnimation(btt1)
        icon2.startAnimation(btt2)
        icon3.startAnimation(btt3)
        tbFollow.startAnimation(btt_follow)



    }
}

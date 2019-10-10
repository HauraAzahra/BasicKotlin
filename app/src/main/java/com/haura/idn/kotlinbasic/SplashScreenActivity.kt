package com.haura.idn.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        tampilansplash.setAnimation("AndroidWave.json")
        tampilansplash.playAnimation()
        tampilansplash.loop(true)

        //handler = untuk penundaan ke suatu action atau perintah

        var handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this@SplashScreenActivity,MainActivity::class.java))
            finish()
        },4000)
    }
}

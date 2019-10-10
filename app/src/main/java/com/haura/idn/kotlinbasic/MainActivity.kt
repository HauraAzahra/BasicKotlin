package com.haura.idn.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_kalkulator.setOnClickListener{
            startActivity(Intent(this@MainActivity,KalkulatorActivity::class.java))
        }

        btn_list_view.setOnClickListener {
            startActivity(Intent(this@MainActivity,ListViewActivity::class.java))

        }

        btn_web_view.setOnClickListener {
            startActivity(Intent(this@MainActivity,LinkWebActivity::class.java))
        }

        btn_spiner.setOnClickListener {
            startActivity(Intent(this@MainActivity,SpinerActivity::class.java))
        }

        btn_grid_view.setOnClickListener {
            startActivity(Intent(this@MainActivity,GridViewActivity::class.java))
        }
    }
}

package com.haura.idn.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        btn_list_biasa.setOnClickListener {
            startActivity(Intent(this@ListViewActivity,ListBiasaActivity::class.java))

        }

        btn_list_costum.setOnClickListener {
            startActivity(Intent(this@ListViewActivity,ListCostumActivity::class.java))

        }
    }
}

package com.haura.idn.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.haura.idn.kotlinbasic.model.Beauty
import com.haura.idn.kotlinbasic.model.Skincare
import kotlinx.android.synthetic.main.activity_detail_beauty.*
import kotlinx.android.synthetic.main.activity_detail_skincare.*

class DetailBeautyActivity : AppCompatActivity() {

    var dataBeauty : Beauty? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_beauty)

        val intent = intent
        //get data from intent to variable

        dataBeauty  = intent.getParcelableExtra<Beauty>("beauty")

        var nama = dataBeauty?.namaBeauty
        var gambar = dataBeauty?.gambarBeauty
        var detail = dataBeauty?.detailBeauty

        //set name to title
        this@DetailBeautyActivity.setTitle(nama)

        txtdetailbeauty.text = detail
        txtnamabeauty.text = nama
        gambar?.let { ivbeauty.setImageResource(it) }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        if (id == R.id.menu_link){
            var  intent = Intent(this@DetailBeautyActivity,LinkWebActivity::class.java)
            intent.putExtra("link",dataBeauty?.urlBeauty)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
    }


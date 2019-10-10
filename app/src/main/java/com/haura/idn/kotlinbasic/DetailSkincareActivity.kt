package com.haura.idn.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.haura.idn.kotlinbasic.model.Skincare
import kotlinx.android.synthetic.main.activity_detail_skincare.*

class DetailSkincareActivity : AppCompatActivity() {

    var dataSkincare : Skincare? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_skincare)

        val intent = intent
        //get data from intent to variable

        dataSkincare  = intent.getParcelableExtra<Skincare>("skincare")

        var nama = dataSkincare?.namaSkincare
        var gambar = dataSkincare?.gambarSkincare
        var detail = dataSkincare?.detailSkincare

        //set name to title
        this@DetailSkincareActivity.setTitle(nama)

        txtdetail.text = detail
        txtnamamakanan.text = nama
        gambar?.let { ivmakanan.setImageResource(it) }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        if (id == R.id.menu_link){
            var  intent = Intent(this@DetailSkincareActivity,LinkWebActivity::class.java)
            intent.putExtra("link",dataSkincare?.url)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}

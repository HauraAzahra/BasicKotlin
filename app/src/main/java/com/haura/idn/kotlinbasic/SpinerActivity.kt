package com.haura.idn.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_detail_skincare.*
import kotlinx.android.synthetic.main.activity_spiner.*

class SpinerActivity : AppCompatActivity() {
    var data = arrayOf("Ponds","Emina","Garnier","Pixy","Wardah","Safi", "Clean & Clear")

//    var datagambar = arrayOf(R.drawable.rendang,R.drawable.ayambakar,R.drawable.rendang,R.drawable.ayambakar,R.drawable.rendang)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spiner)


        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_skincare.adapter=adapter
        spinner_skincare.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                imgmakanan.setImageResource(datagambar[position])
//                txtnamamakanan.text =data[position]
            }

        }
    }
}
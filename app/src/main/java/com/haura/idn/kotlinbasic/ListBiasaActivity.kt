package com.haura.idn.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_biasa.*

class ListBiasaActivity : AppCompatActivity() {

    //declare data
    var dataSkincare = arrayOf("Ponds", "Emina", "Wardah", "Safi","Garnier","Pixy","Clean & Clear")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_biasa)

        //adapter = untuk menghubungkan data dengan view

        var adaper = ArrayAdapter(this,android.R.layout.simple_list_item_1,dataSkincare)
        list_biasa.adapter = adaper
    }
}

package com.haura.idn.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kalkulator.*

class KalkulatorActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        btntambah.setOnClickListener(this)
        btnkurang.setOnClickListener(this)
        btnkali.setOnClickListener(this)
        btnbagi.setOnClickListener(this)

        //mengapa pake this? karena mau di bungkus
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btntambah -> preValidate('+')
            R.id.btnkurang -> preValidate('-')
            R.id.btnkali -> preValidate('*')
            R.id.btnbagi -> preValidate('/')
            //petik satu karena menandakan karakter
        }
    }

    private fun preValidate(c: Char) {
        if (validate()) calculate(c)
        else Toast.makeText(this,"Tidak Boleh Kosong",Toast.LENGTH_SHORT).show()
    }

    private fun validate(): Boolean {
        if (edtangka1.text.isEmpty()||
            edtangka2.text.isEmpty()) return false
        else return true
    }

    private fun calculate(c: Char) {
        when(c){
            '+' -> txtresult.text = (edtangka1.text.toString().toDouble()+
                    edtangka2.text.toString().toDouble()).toString()

            '-' -> txtresult.text = (edtangka1.text.toString().toDouble()-
                    edtangka2.text.toString().toDouble()).toString()

            '*' -> txtresult.text = (edtangka1.text.toString().toDouble()*
                    edtangka2.text.toString().toDouble()).toString()

            '/' -> txtresult.text = (edtangka1.text.toString().toDouble()/
                    edtangka2.text.toString().toDouble()).toString()
        }
    }
}

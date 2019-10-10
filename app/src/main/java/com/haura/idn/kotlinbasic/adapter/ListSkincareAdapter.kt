package com.haura.idn.kotlinbasic.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.haura.idn.kotlinbasic.ListCostumActivity
import com.haura.idn.kotlinbasic.R
import com.haura.idn.kotlinbasic.model.Skincare
import kotlinx.android.synthetic.main.tampilancostumlist.view.*

class ListSkincareAdapter(

    var listCostumActivity: ListCostumActivity,
    var listSkincare: ArrayList<Skincare>) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var skincareItem = listSkincare[p0]
        var inflater = listCostumActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var tampilan = inflater.inflate(R.layout.tampilancostumlist,null)
        tampilan.tvName.text = skincareItem.namaSkincare


        skincareItem.gambarSkincare?.let { tampilan.ivSkincareImage.setImageResource(it) }
        return tampilan
    }
    override fun getItem(p0: Int): Any = listSkincare[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getCount(): Int = listSkincare.size
}
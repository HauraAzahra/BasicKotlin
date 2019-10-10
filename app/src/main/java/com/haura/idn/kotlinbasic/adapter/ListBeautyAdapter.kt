package com.haura.idn.kotlinbasic.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.haura.idn.kotlinbasic.GridViewActivity
import com.haura.idn.kotlinbasic.ListCostumActivity
import com.haura.idn.kotlinbasic.R
import com.haura.idn.kotlinbasic.model.Beauty
import com.haura.idn.kotlinbasic.model.Skincare
import kotlinx.android.synthetic.main.tampilancostumlist.view.*
import kotlinx.android.synthetic.main.tampilangrid.view.*

class ListBeautyAdapter(

    var gridViewActivity: GridViewActivity,
    var listbeauty: ArrayList<Beauty>) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var beautyItem = listbeauty[p0]
        var inflater = gridViewActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var tampilan = inflater.inflate(R.layout.tampilangrid,null)
        tampilan.tvBeauty.text = beautyItem.namaBeauty

        beautyItem.gambarBeauty?.let { tampilan.ivBeautyImage.setImageResource(it) }
        return tampilan
    }
    override fun getItem(p0: Int): Any = listbeauty[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getCount(): Int = listbeauty.size
}
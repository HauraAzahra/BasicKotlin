package com.haura.idn.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haura.idn.kotlinbasic.adapter.ListSkincareAdapter
import com.haura.idn.kotlinbasic.model.Skincare
import kotlinx.android.synthetic.main.activity_list_costum.*

class ListCostumActivity : AppCompatActivity() {

    var listSkincare = ArrayList<Skincare>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_costum)

        listSkincare.add(
            Skincare("Ponds Tone Up Cream",
                "Tone Up Cream",
                "Membuat wajah 10 kali lebih cerah",
            R.drawable.ponds,
            "https://www.ponds.com/"))

        listSkincare.add(
            Skincare("Emina Tone Up Cream",
                "Tone Up Cream",
                "Membuat wajah 20 kali lebih cerah",
                R.drawable.emina,
                "http://www.eminacosmetics.com/"))

        listSkincare.add(
            Skincare("Wardah Tone Up Cream",
                "Tone Up Cream",
                "Membuat wajah 30 kali lebih cerah",
                R.drawable.wardah,
                "https://www.wardahbeauty.com/"))

        listSkincare.add(
            Skincare("Safi",
                "Pencuci Muka",
                "Membersihkan wajah dari debu",
                R.drawable.safi,
                "https://www.safiindonesia.com/"))

        listSkincare.add(
            Skincare("Garnier Sakura White",
                "Cream White Face",
                "Membuat wajah 40 kali lebih cerah dari biasanya",
                R.drawable.garnier,
                "https://www.garnier.co.id/"))

        listSkincare.add(
            Skincare("Bedak Pixy",
                "Bedak Muka",
                "Membuat wajah lebih cerah",
                R.drawable.pixy,
                "http://www.pixy.co.id/"))

        listSkincare.add(
            Skincare("Clean & Clear",
                "Pencuci Wajah",
                "Membersihkan wajah dari debu",
                R.drawable.cleanclear,
                "https://www.cleanandclear.com/"))



        var  adapter = ListSkincareAdapter(this,listSkincare)
        //agar saling terhubung ke activity makanya make context
        list_costum.adapter=adapter

        list_costum.setOnItemClickListener{ adapterView, view, i, l ->
            var skincare = listSkincare[i]
            val intent = Intent(this@ListCostumActivity,DetailSkincareActivity::class.java)
            intent.putExtra("skincare",skincare)
            startActivity(intent)

        }
    }
}

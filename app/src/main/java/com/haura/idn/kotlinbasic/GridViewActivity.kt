package com.haura.idn.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haura.idn.kotlinbasic.adapter.ListBeautyAdapter
import com.haura.idn.kotlinbasic.adapter.ListSkincareAdapter
import com.haura.idn.kotlinbasic.model.Beauty
import com.haura.idn.kotlinbasic.model.Skincare
import kotlinx.android.synthetic.main.activity_grid_view.*
import kotlinx.android.synthetic.main.activity_list_costum.*

class GridViewActivity : AppCompatActivity() {

    var listbeauty = ArrayList<Beauty>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)


        listbeauty.add(
            Beauty("Abel Cantika",
                "Beauty Vloger Indonesia",
                "Cantik",
                R.drawable.abel,
                "https://loop.co.id/articles/fakta-unik-abel-cantika/full")
        )

        listbeauty.add(
           Beauty("Nanda Arsyinta",
                "Beauty Vloger Indonesia",
                "Cantik",
                R.drawable.nanda,
                "https://www.anakkost.tv/biodata-nanda-arsyinta/")
        )

        listbeauty.add(
            Beauty("Tasya Farasya",
                "Beauty Vloger Indonesia",
                "Cantik",
                R.drawable.tasya,
                "https://www.tempo.co/tag/tasya-farasya")
        )

        listbeauty.add(
          Beauty("Hanggini Purinda Retto",
                "Beauty Vloger Indonesia",
                "Cantik",
                R.drawable.hanggini,
                "https://www.famous.id/creator/hanggini")
        )

        var  adapter = ListBeautyAdapter(this,listbeauty)
        //agar saling terhubung ke activity makanya make context
        grid_view.adapter=adapter

        grid_view.setOnItemClickListener{ adapterView, view, i, l ->
            var beauty = listbeauty[i]
            val intent = Intent(this@GridViewActivity,DetailBeautyActivity::class.java)
            intent.putExtra("beauty",beauty)
            startActivity(intent)

        }

    }
}

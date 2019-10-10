package com.haura.idn.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_link_web.*

class LinkWebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link_web)

        web_view.webViewClient = WebViewClient()
        web_view.settings.javaScriptEnabled = true
        var tangkapdata = intent.extras?.getString("link")


        if (tangkapdata != null)
            web_view.loadUrl(tangkapdata)
        else web_view.loadUrl("https://www.beautyhaulofficial.com/")

    }
}

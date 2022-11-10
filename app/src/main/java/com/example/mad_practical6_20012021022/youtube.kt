package com.example.mad_practical6_20012021022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeid="l04omgNTOt0"
        val mywebview=findViewById<WebView>(R.id.wv)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}
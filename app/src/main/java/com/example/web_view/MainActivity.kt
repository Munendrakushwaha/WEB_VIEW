package com.example.web_view

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webv = findViewById<WebView>(R.id.webview)

                webviewsetup(webv)
    }


    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webviewsetup(webView: WebView)
    {
        webView.webViewClient= WebViewClient()

        webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true

            loadUrl("https://glauniversity.in:8085/")

        }
    }
}
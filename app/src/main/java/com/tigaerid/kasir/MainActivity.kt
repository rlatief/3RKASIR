package com.tigaerid.kasir

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if ( userLoggedOn() ) {

            setContentView(R.layout.activity_main)

        } else {

            setContentView(R.layout.activity_main_login)

            val webLogin = findViewById<WebView>(R.id.webLogin)

            webLogin.getSettings().setJavaScriptEnabled(true)
            webLogin.getSettings().setDomStorageEnabled(true)
            webLogin.webViewClient = WebViewClient()
            webLogin.loadUrl("https://tigaer.id/login?app")
            //setContentView(R.layout.activity_main_unauthorized)

        }

    }

    private fun userLoggedOn(): Boolean {


        return false

    }

}

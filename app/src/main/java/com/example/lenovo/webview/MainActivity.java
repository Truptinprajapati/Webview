package com.example.lenovo.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView=(WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
      // webView.loadUrl("https://github.com/");
         webView.loadUrl("http://www.gtumcappt.blogspot.com");
        webView.setWebViewClient(new MyWebViewClient());

    }
}




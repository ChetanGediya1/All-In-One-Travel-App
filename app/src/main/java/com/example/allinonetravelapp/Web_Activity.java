package com.example.allinonetravelapp;

import static androidx.constraintlayout.widget.ConstraintSet.GONE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Web_Activity extends AppCompatActivity {
    WebView webView;
    ProgressBar progressbar;
    TextView please_wait;
    ImageView box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webview);
        progressbar = findViewById(R.id.progressbar);
        please_wait = findViewById(R.id.please_wait);
        box = findViewById(R.id.box);

        Intent intent=getIntent();
        String weblink=intent.getStringExtra("links");
        webView.loadUrl(weblink);
        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webSettings.setJavaScriptEnabled(true);

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);

                if (newProgress == 100)
                {
                    box.setVisibility(View.GONE);
                    progressbar.setVisibility(View.GONE);
                    please_wait.setVisibility(View.GONE);

                }

            }
        });


    }
}
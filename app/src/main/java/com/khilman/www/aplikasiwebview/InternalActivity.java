package com.khilman.www.aplikasiwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class InternalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal);

        WebView webViewInternal = (WebView) findViewById(R.id.webView);
        webViewInternal.loadUrl("file:///android_asset/halaman_google.html");
    }
}

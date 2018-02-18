package com.khilman.www.aplikasiwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ExternalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external);

        // Deklarasi inisialisasi
        WebView webViewKita = (WebView) findViewById(R.id.webView);
        // Tambahkan web view Cliet
        webViewKita.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                // tampilkan toast
                Toast.makeText(ExternalActivity.this, "Terjadi error", Toast.LENGTH_SHORT).show();
            }
        });
        // aktifkan fitur tambahan
        webViewKita.getSettings().setBuiltInZoomControls(true);
        webViewKita.getSettings().setJavaScriptEnabled(true);
        // Load website
        webViewKita.loadUrl("http://www.google.com");

    }
}

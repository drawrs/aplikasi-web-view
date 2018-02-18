package com.khilman.www.aplikasiwebview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Deklarasi
    Button btnExternal, btnInternal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inisialisasi
        btnExternal = (Button) findViewById(R.id.btnExternal);
        btnInternal = (Button) findViewById(R.id.btnInternal);

        // Event OnClick
        btnExternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mulai activity baru
                startActivity(new Intent(MainActivity.this, ExternalActivity.class));
            }
        });

        // Event OnClick
        btnInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mulai activity baru
                startActivity(new Intent(MainActivity.this, InternalActivity.class));
            }
        });
    }
}

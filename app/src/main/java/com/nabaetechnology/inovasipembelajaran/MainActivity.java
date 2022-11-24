package com.nabaetechnology.inovasipembelajaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Syarif Academy");

        Button btTujuanPembelajaran = findViewById(R.id.btnTujuanPembelajaran);
        Button btPertanyaanPemantik = findViewById(R.id.btnPertanyaan);

        btTujuanPembelajaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TujPem = new Intent(MainActivity.this, TujuanPembelajaran.class);
                startActivity(TujPem);
            }
        });

        btPertanyaanPemantik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PerPem = new Intent(MainActivity.this, PertanyaanPemantik.class);
                startActivity(PerPem);
            }
        });
    }
}
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
        Button btnPetaKonsep    = findViewById(R.id.btnPetaKonsep);
        Button btnMateri = findViewById(R.id.btnMateri);
        Button btnAbout =findViewById(R.id.btnTentang);

        btTujuanPembelajaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TujPem = new Intent(MainActivity.this, PembelajaranActivity.class);
                startActivity(TujPem);
            }
        });

        btPertanyaanPemantik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PerPem = new Intent(MainActivity.this, PemantikActivity.class);
                startActivity(PerPem);
            }
        });

        btnPetaKonsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PetKon= new Intent(MainActivity.this, KonsepActivity.class);
                startActivity(PetKon);
            }
        });

        btnMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent materi= new Intent(MainActivity.this, MateriActivity.class);
                startActivity(materi);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(about);
            }
        });
    }
}
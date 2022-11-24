package com.nabaetechnology.inovasipembelajaran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class PemantikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan_pemantik);
        setTitle("Pertanyaan Pemantik");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);
        actionBar.setDisplayHomeAsUpEnabled(true);

        DBMateri dbMateri = new DBMateri(PemantikActivity.this);

        TextView tvIsi = (TextView) findViewById(R.id.tvIsi);
        if (dbMateri.isNull())
        {
            Log.d("test","kosong");
        }else
        {
            Log.d("test","isi");
        }
        tvIsi.setText(dbMateri.findMateri().getIsi());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
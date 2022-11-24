package com.nabaetechnology.inovasipembelajaran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class KonsepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsep);
        setTitle("Peta Konsep");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);
        actionBar.setDisplayHomeAsUpEnabled(true);

        DBKonsep dbKonsep = new DBKonsep(KonsepActivity.this);

        TextView tvKonsep = (TextView) findViewById(R.id.tvKonsepIsi);

        if (dbKonsep.isNull()) {
            Log.d("test", "kosong");
        } else {
            Log.d("test", "isi");
        }
        tvKonsep.setText(dbKonsep.findMateri().getIsi());
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
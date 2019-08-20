package com.example.passingmydata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class hasilOrderan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_orderan);

        Intent intent = getIntent();

        String nama = intent.getStringExtra("Nama");
        String alamat = intent.getStringExtra("Alamat");
        String pesanan = intent.getStringExtra("Pesanan");

        TextView txtNama = findViewById(R.id.tvNama);
        txtNama.setText(nama);
        TextView txtAlamat = findViewById(R.id.tvAlamat);
        txtAlamat.setText(alamat);

        TextView txtPesanan = findViewById(R.id.tvPesanan);
        txtPesanan.setText(pesanan);


    }
}

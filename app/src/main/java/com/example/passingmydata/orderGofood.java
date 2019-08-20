package com.example.passingmydata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class orderGofood extends AppCompatActivity implements View.OnClickListener {
    EditText EdiText1,EdiText2,EdiText3;
    Button my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_gofood);




        my = findViewById(R.id.btnKonfirm);
        my.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EdiText1 = findViewById(R.id.edit1);
        EdiText2 = findViewById(R.id.edit2);
        EdiText3 = findViewById(R.id.edit3);

        String nama = EdiText1.getText().toString();
        String alamat = EdiText2.getText().toString();
        String pesanan = EdiText3.getText().toString();

        if(view.getId() == R.id.btnKonfirm){

            Intent niat = new Intent(orderGofood.this,hasilOrderan.class);
            niat.putExtra("Nama",nama);
            niat.putExtra("Alamat",alamat);
            niat.putExtra("Pesanan",pesanan);
            startActivity(niat);
        }

    }
}

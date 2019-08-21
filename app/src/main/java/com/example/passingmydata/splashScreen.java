package com.example.passingmydata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends AppCompatActivity {
private int waktuLoading = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent niatan = new Intent(splashScreen.this,MainActivity.class);
                startActivity(niatan);
                finish();
            }
        },waktuLoading);




    }
}

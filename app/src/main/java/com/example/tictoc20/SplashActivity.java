package com.example.tictoc20;

// second time created

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    Intent iHome;//1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                iHome=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(iHome);
                finish();
            }
        },3000);
    }
}
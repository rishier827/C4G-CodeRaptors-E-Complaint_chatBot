package com.example.dilsh.e_complaint;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    private static int SPLASH_TIMEOUT =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.emblemsl);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(splash.this,homedashboard.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIMEOUT);
    }
}

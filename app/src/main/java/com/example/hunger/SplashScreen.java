package com.example.hunger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
              //  Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(new Intent(SplashScreen.this,MainActivity.class));
                finish();
            }
        },2000);
    }
}
/*
Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();



 */
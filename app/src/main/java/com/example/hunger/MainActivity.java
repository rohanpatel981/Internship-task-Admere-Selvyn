package com.example.hunger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_already_login = findViewById(R.id.btn_already_login);
        Button btn_getStarted = findViewById(R.id.btn_getStarted);

        String text = "Already a Tiffina Member? Login  ";
        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsOrange = new ForegroundColorSpan(Color.RED);
        ss.setSpan(fcsOrange, 26,32, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        btn_already_login.setText(ss);

        SpannableString string = new SpannableString("GET STARTED\n Get exclusive offers and discount");
        ForegroundColorSpan fcsBlack = new ForegroundColorSpan(Color.BLACK);
        string.setSpan(fcsBlack,13,46,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        string.setSpan(new AbsoluteSizeSpan(20, true), 0, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        string.setSpan(new AbsoluteSizeSpan(10, true), 13, 46, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        btn_getStarted.setText(string);
    }

public void goToLogin(View view){
    startActivity(new Intent(getApplicationContext(),Login_screen_3.class));
}
}
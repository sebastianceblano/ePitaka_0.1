package com.example.sebastianceblano.epitaka_01;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private final int  SPLASH_DELAY=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide(); //Code to hide action bar



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent ;
                intent = new Intent(SplashActivity.this,NavigationEPitaka.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_DELAY);
    }
}

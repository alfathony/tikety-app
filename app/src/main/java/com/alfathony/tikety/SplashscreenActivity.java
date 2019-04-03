package com.alfathony.tikety;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        // Set timer 2s
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Go to get started activity
                Intent toGetStarted = new Intent(SplashscreenActivity.this, GetstartedActivity.class);
                startActivity(toGetStarted);
                finish();
            }
        }, 1000);
    }
}

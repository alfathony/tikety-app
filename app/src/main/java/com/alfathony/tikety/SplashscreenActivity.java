package com.alfathony.tikety;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashscreenActivity extends AppCompatActivity {

    Animation app_splash, fade_in_to_top;
    ImageView appLogo;
    TextView appCaption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        // Load animation
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        fade_in_to_top = AnimationUtils.loadAnimation(this, R.anim.fade_in_to_top);

        // Load element
        appLogo = findViewById(R.id.appLogo);
        appCaption = findViewById(R.id.appCaption);

        // Run animation
        appLogo.startAnimation(app_splash);
        appCaption.startAnimation(fade_in_to_top);

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

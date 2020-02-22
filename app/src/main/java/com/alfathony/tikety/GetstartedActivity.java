package com.alfathony.tikety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class   GetstartedActivity extends AppCompatActivity {

    Animation fade_in_to_top;
    Button btn_sign_in;
    Button btn_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);

        // Load animation
        fade_in_to_top = AnimationUtils.loadAnimation(this, R.anim.fade_in_to_top);

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_up = findViewById(R.id.btn_sign_up);

        // Set animation
        btn_sign_in.startAnimation(fade_in_to_top);
        btn_sign_up.startAnimation(fade_in_to_top);

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosignin = new Intent(GetstartedActivity.this,SigninActivity.class);
                startActivity(gotosignin);
            }
        });

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto_signup = new Intent(GetstartedActivity.this, RegisterOneActivity.class);
                startActivity(goto_signup);
            }
        });
    }
}

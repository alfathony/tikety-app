package com.alfathony.tikety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    TextView new_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        new_account = findViewById(R.id.btn_new_account);

        new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto_signup = new Intent(SigninActivity.this,RegisterOneActivity.class);
                startActivity(goto_signup);
            }
        });
    }
}

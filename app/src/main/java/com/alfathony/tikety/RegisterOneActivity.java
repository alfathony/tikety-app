package com.alfathony.tikety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class RegisterOneActivity extends AppCompatActivity {

    Button btn_sign_up_continue;
    ImageButton btn_back;
    EditText username, password, email_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_one);

        btn_sign_up_continue = findViewById(R.id.btn_sign_up_continue);
        btn_back = findViewById(R.id.btn_back);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email_address = findViewById(R.id.email_address);

        btn_sign_up_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRegisterTwo = new Intent(RegisterOneActivity.this, RegisterTwoActivity.class);
                startActivity(goToRegisterTwo);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}

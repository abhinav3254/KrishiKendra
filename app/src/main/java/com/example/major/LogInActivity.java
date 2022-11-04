package com.example.major;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.major.databinding.ActivityLogInBinding;

public class LogInActivity extends AppCompatActivity {

    ActivityLogInBinding logInBinding;
    String captchaValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_log_in);
        getSupportActionBar().hide();
//        textView = findViewById(R.id.newUser);

        logInBinding = ActivityLogInBinding.inflate(getLayoutInflater());
        View view = logInBinding.getRoot();
        setContentView(view);

        logInBinding.newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

        captcha();

        logInBinding.refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                captcha();
            }
        });

        logInBinding.logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this,DashBoardActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void captcha() {
        int max = 3999;
        int min = 99;

        int captchaAnswer = (int) (Math.random()*(max-min+1)+min);

        logInBinding.captchaShow.setText(""+captchaAnswer);
    }
}
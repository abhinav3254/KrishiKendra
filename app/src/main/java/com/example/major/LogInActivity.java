package com.example.major;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.major.databinding.ActivityLogInBinding;

public class LogInActivity extends AppCompatActivity {

    ActivityLogInBinding logInBinding;

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
                finish();
            }
        });

    }
}
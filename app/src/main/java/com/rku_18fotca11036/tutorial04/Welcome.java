package com.rku_18fotca11036.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().setTitle("Login Page");
    }
}
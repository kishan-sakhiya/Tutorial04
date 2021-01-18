package com.rku_18fotca11036.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
            Intent intent = new Intent(Splash.this,MainActivity.class);
            startActivity(intent);
            finish();;
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask,2000);
     }
}
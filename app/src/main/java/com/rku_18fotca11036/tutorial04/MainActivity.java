package com.rku_18fotca11036.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edtUsername,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Login here");

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valUsername = edtUsername.getText().toString();
                String valPassword = edtPassword.getText().toString();

                if (valUsername.equals("")) {
                    Toast.makeText(MainActivity.this, "Empty Username", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (valPassword.equals("")) {
                    Toast.makeText(MainActivity.this, "Empty Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (valPassword.length() < 8) {
                    Toast.makeText(MainActivity.this, "Password must be minimum 8 charator", Toast.LENGTH_SHORT).show();
                    return;
                }
               if(!Patterns.EMAIL_ADDRESS.matcher(valUsername).matches()){
                   Toast.makeText(MainActivity.this, "Username must be proper email adddress. ", Toast.LENGTH_SHORT).show();
                    return;
               }

                if(valUsername.equals("admin@gmail.com") && valPassword.equals("admin"))
                {
                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    startActivity(intent);
                    finish();
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
        });


    }
}
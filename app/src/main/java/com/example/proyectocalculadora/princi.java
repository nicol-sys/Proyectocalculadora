package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.Principal;


public class princi extends AppCompatActivity {

    Button sig,sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princi);

        sig=findViewById(R.id.cal);
        sec=findViewById(R.id.sec);

        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(princi.this, MainActivity.class);
                startActivity(intent);
            }
        });
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(princi.this, secundaria.class);
                startActivity(intent);
            }
        });
    }
}
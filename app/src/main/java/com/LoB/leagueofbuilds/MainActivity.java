package com.LoB.leagueofbuilds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button top;
    Button jg;
    Button mid;
    Button adc;
    Button supp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top = findViewById(R.id.top_button);
        jg = findViewById(R.id.jg_button);
        mid = findViewById(R.id.mid_button);
        adc = findViewById(R.id.adc_button);
        supp = findViewById(R.id.supp_button);


        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent top = new Intent(MainActivity.this, TopActivity.class);
                startActivity(top);
            }
        });
        jg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jungle = new Intent(MainActivity.this, JungleActivity.class);
                startActivity(jungle);
            }
        });
        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mid = new Intent(MainActivity.this, MidActivity.class);
                startActivity(mid);
            }
        });
        adc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adc = new Intent(MainActivity.this, AdcActivity.class);
                startActivity(adc);
            }
        });
        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suppport = new Intent(MainActivity.this, SupportActivity.class);
                startActivity(suppport);
            }
        });
    }
}

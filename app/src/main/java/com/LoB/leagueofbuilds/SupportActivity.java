package com.LoB.leagueofbuilds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SupportActivity extends AppCompatActivity {
    ImageButton oculto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        oculto = findViewById(R.id.oculto);

        oculto.setEnabled(false);
        oculto.setVisibility(View.INVISIBLE);
    }
}

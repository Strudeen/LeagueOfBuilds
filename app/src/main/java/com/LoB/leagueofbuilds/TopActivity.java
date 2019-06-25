package com.LoB.leagueofbuilds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TopActivity extends AppCompatActivity {
    ImageButton oculto;
    ImageButton atrox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        oculto = findViewById(R.id.oculto);
        oculto.setEnabled(false);
        oculto.setVisibility(View.INVISIBLE);

        atrox = findViewById(R.id.imageButton6);

        atrox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atrox = new Intent(TopActivity.this, AtroxActivity.class);
                startActivity(atrox);
            }
        });


    }
}

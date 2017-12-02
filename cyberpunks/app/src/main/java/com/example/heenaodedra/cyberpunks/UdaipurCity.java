package com.example.heenaodedra.cyberpunks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UdaipurCity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udaipur_city);

        Button lp = (Button) findViewById(R.id.LP);
        Button cpu = (Button) findViewById(R.id.CPU);
        Button fs = (Button) findViewById(R.id.FS);

        lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lakepichola();
            }
        });

        cpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cpu();
            }
        });
    }

    private void cpu() {

    }

    private void lakepichola() {

    }
}

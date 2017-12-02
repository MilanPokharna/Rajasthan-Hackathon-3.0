package com.example.heenaodedra.cyberpunks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cityList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);

        TextView udaipur = (TextView) findViewById(R.id.udai);
        udaipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });
    }

    private void next() {
        Intent intent = new Intent(this,UdaipurCity.class);
        startActivity(intent);
    }
}

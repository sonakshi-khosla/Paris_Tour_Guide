package com.example.sonakshi.paris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sights = findViewById(R.id.sights);

        sights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sightIntent = new Intent(MainActivity.this, Sights.class);
                startActivity(sightIntent);
            }
        });

        TextView food = findViewById(R.id.food);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodIntent = new Intent(MainActivity.this, Food.class);
                startActivity(foodIntent);
            }
        });

        TextView shops = findViewById(R.id.shops);

        shops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shopIntent = new Intent(MainActivity.this, Shops.class);
                startActivity(shopIntent);
            }
        });

        TextView info = findViewById(R.id.info);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infoIntent = new Intent(MainActivity.this, Info.class);
                startActivity(infoIntent);
            }
        });
    }
}

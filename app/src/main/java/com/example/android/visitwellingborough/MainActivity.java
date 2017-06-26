package com.example.android.visitwellingborough;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Onclick for intent to Pubs Activity

        TextView pubTextView = (TextView) findViewById(R.id.tv_pubs);
        pubTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PubsActivity.class);
                startActivity(intent);
            }
        });

        //Onclick for intent to Restaurant Activity

        TextView restaurantTextView = (TextView) findViewById(R.id.tv_restaurants);
        restaurantTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, RestaurantActivity.class);
                startActivity(intent);
            }
        });

        //Onclick for intent to Parks Activity

        TextView parksTextView = (TextView) findViewById(R.id.tv_parks);
        parksTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(intent);
            }
        });

        //Onclick for intent to SightSeeing Activity

        TextView sightSeeingTextView = (TextView) findViewById(R.id.tv_sightseeing);
        sightSeeingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SightSeeingActivity.class);
                startActivity(intent);
            }
        });

    }
}
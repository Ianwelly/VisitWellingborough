package com.example.android.visitwellingborough;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SightSeeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight_seeing);

        ArrayList<Description> sights = new ArrayList<>(6);

        sights.add(new Description(getString(R.string.text_view_title_museum),
                getString(R.string.text_view_info_museum),R.drawable.wellingborough_museum));
        sights.add(new Description(getString(R.string.text_view_title_castle_theatre),
                getString(R.string.text_view_info_castle_theatre), R.drawable.castle_theatre));
        sights.add(new Description(getString(R.string.text_view_title_silver_ladies),
                getString(R.string.text_view_info_silver_ladies), R.drawable.silver_ladies));
        sights.add(new Description(getString(R.string.text_view_title_carnival),
                getString(R.string.text_view_info_carnival), R.drawable.carnival));
        sights.add(new Description(getString(R.string.text_view_title_waendal_walk),
                getString(R.string.text_view_info_waendal_walk),
                R.drawable.waendal_walk));
        sights.add(new Description(getString(R.string.text_view_title_medival_festival),
                getString(R.string.text_view_info_medieval_festival),
                R.drawable.medieval_festival));

        DescriptionAdapter adapter = new DescriptionAdapter(this, sights);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

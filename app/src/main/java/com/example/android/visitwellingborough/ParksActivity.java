package com.example.android.visitwellingborough;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        ArrayList<Description> parks = new ArrayList<>(5);

        parks.add(new Description(getString(R.string.text_view_title_irchester_country_park),
                getString(R.string.text_view_info_irchester_country_park),
                R.drawable.irchester_country_park));
        parks.add(new Description(getString(R.string.text_view_title_splash),
                getString(R.string.text_view_info_splash), R.drawable.splash_park));
        parks.add(new Description(getString(R.string.text_view_title_stanwick_lakes),
                getString(R.string.text_view_info_stanwick_lakes),
                R.drawable.stanwick_lakes));
        parks.add(new Description( getString(R.string.text_view_title_wicksteed),
                getString(R.string.text_view_info_wicksteed),
                R.drawable.wicksteed_park_logo));
        parks.add(new Description(getString(R.string.text_view_title_sywell_country_park),
                getString(R.string.text_view_info_sywell_country_park),
                R.drawable.sywell_country_park));

        DescriptionAdapter adapter = new DescriptionAdapter(this, parks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

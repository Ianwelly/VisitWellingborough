package com.example.android.visitwellingborough;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PubsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pubs);

        ArrayList<Description> pubsList = new ArrayList<>(10);

        pubsList.add(new Description(getString(R.string.text_view_title_hind_hotel),
                (getString(R.string.text_view_info_hind)),
                R.drawable.hind_hotel));
        pubsList.add(new Description(getString(R.string.text_view_title_cannon),
                (getString(R.string.text_view_info_canon)), R.drawable.canon));
        pubsList.add(new Description(getString(R.string.text_view_title_horseshoe),
                (getString(R.string.text_view_info_horseshoe)),
                R.drawable.horseshoe));
        pubsList.add(new Description(getString(R.string.text_view_title_redwell),
                (getString(R.string.text_view_redwell_info))
                ,R.drawable.red_well));
        pubsList.add(new Description(getString(R.string.text_view_title_coach_and_horses),
                (getString(R.string.text_view_info_coach_and_horses)),
                R.drawable.coach_and_horses));
        pubsList.add(new Description(getString(R.string.text_view_och_and_dough_title),
                (getString(R.string.text_view_info_och_and_dough)), R.drawable.och_n_dough));
        pubsList.add(new Description(getString(R.string.text_view_title_priory),
                (getString(R.string.text_view_info_priory)),R.drawable.priory));
        pubsList.add(new Description(getString(R.string.text_view_title_dog_and_duck),
                (getString(R.string.text_view_info_dog_and_duck)),
                R.drawable.dog_and_duck ));
        pubsList.add(new Description(getString(R.string.text_view_title_cutting_room),
                (getString(R.string.text_view_info_cutting_room)), R.drawable.cutting_room ));
        pubsList.add(new Description(getString(R.string.text_view_title_rising_sun),
                (getString(R.string.text_view_info_rising_sun)),
                R.drawable.rising_sun));

        DescriptionAdapter adapter = new DescriptionAdapter(this, pubsList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

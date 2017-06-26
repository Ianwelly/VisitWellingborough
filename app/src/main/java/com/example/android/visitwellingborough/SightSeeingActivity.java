package com.example.android.visitwellingborough;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SightSeeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight_seeing);

        final ArrayList<Description> sights = new ArrayList<>(6);

        sights.add(new Description(getString(R.string.text_view_title_museum),
                getString(R.string.text_view_info_museum),R.drawable.wellingborough_museum, getString(R.string.uri_museum)));
        sights.add(new Description(getString(R.string.text_view_title_castle_theatre),
                getString(R.string.text_view_info_castle_theatre), R.drawable.castle_theatre, getString(R.string.uri_castle)));
        sights.add(new Description(getString(R.string.text_view_title_silver_ladies),
                getString(R.string.text_view_info_silver_ladies), R.drawable.silver_ladies, getString(R.string.uri_silver_ladies)));
        sights.add(new Description(getString(R.string.text_view_title_carnival),
                getString(R.string.text_view_info_carnival), R.drawable.carnival, getString(R.string.uri_carnival)));
        sights.add(new Description(getString(R.string.text_view_title_waendal_walk),
                getString(R.string.text_view_info_waendal_walk),
                R.drawable.waendal_walk, getString(R.string.uri_waendal_walk)));
        sights.add(new Description(getString(R.string.text_view_title_medival_festival),
                getString(R.string.text_view_info_medieval_festival),
                R.drawable.medieval_festival, getString(R.string.uri_medieval_festival)));

        DescriptionAdapter adapter = new DescriptionAdapter(this, sights);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Description sightsAndAttractions = (sights.get(position));
                String sightsAndAttractionsIndex = sightsAndAttractions.getUrl();
                Uri uri = Uri.parse(sightsAndAttractionsIndex);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}

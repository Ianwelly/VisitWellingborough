package com.example.android.visitwellingborough;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_parks, container, false);

        final ArrayList<Description> parks = new ArrayList<>(5);

        parks.add(new Description(getString(R.string.text_view_title_irchester_country_park),
                getString(R.string.text_view_info_irchester_country_park),
                R.drawable.irchester_country_park, getString(R.string.uri_irchester_country_park)));
        parks.add(new Description(getString(R.string.text_view_title_splash),
                getString(R.string.text_view_info_splash), R.drawable.splash_park, getString(R.string.uri_splash_park)));
        parks.add(new Description(getString(R.string.text_view_title_stanwick_lakes),
                getString(R.string.text_view_info_stanwick_lakes),
                R.drawable.stanwick_lakes, getString(R.string.uri_stanwick_lakes)));
        parks.add(new Description(getString(R.string.text_view_title_wicksteed),
                getString(R.string.text_view_info_wicksteed),
                R.drawable.wicksteed_park_logo, getString(R.string.uri_wicksteed)));
        parks.add(new Description(getString(R.string.text_view_title_sywell_country_park),
                getString(R.string.text_view_info_sywell_country_park),
                R.drawable.sywell_country_park, getString(R.string.uri_sywell)));

        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), parks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Description park = (parks.get(position));
                String parkIndex = park.getUrl();
                Uri uri = Uri.parse(parkIndex);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        return rootView;
    }
}



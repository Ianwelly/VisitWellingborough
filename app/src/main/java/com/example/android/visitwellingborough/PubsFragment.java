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
public class PubsFragment extends Fragment {


    public PubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_pubs, container, false);

        final ArrayList<Description> pubsList = new ArrayList<>(10);

        pubsList.add(new Description(getString(R.string.text_view_title_hind_hotel),
                (getString(R.string.text_view_info_hind)),
                R.drawable.hind_hotel, getString(R.string.uri_hind_hotel)));
        pubsList.add(new Description(getString(R.string.text_view_title_cannon),
                (getString(R.string.text_view_info_canon)), R.drawable.canon, getString(R.string.uri_cannon)));
        pubsList.add(new Description(getString(R.string.text_view_title_horseshoe),
                (getString(R.string.text_view_info_horseshoe)),
                R.drawable.horseshoe, getString(R.string.uri_horseshoe)));
        pubsList.add(new Description(getString(R.string.text_view_title_redwell),
                (getString(R.string.text_view_redwell_info))
                , R.drawable.red_well, getString(R.string.uri_redwell)));
        pubsList.add(new Description(getString(R.string.text_view_title_coach_and_horses),
                (getString(R.string.text_view_info_coach_and_horses)),
                R.drawable.coach_and_horses, getString(R.string.uri_coach_and_horses)));
        pubsList.add(new Description(getString(R.string.text_view_och_and_dough_title),
                (getString(R.string.text_view_info_och_and_dough)), R.drawable.och_n_dough, getString(R.string.uri_och_and_dough)));
        pubsList.add(new Description(getString(R.string.text_view_title_priory),
                (getString(R.string.text_view_info_priory)), R.drawable.priory, getString(R.string.priory)));
        pubsList.add(new Description(getString(R.string.text_view_title_dog_and_duck),
                (getString(R.string.text_view_info_dog_and_duck)),
                R.drawable.dog_and_duck, getString(R.string.uri_beefeater_dog_and_duck)));
        pubsList.add(new Description(getString(R.string.text_view_title_cutting_room),
                (getString(R.string.text_view_info_cutting_room)), R.drawable.cutting_room, getString(R.string.cutting_room)));
        pubsList.add(new Description(getString(R.string.text_view_title_rising_sun),
                (getString(R.string.text_view_info_rising_sun)),
                R.drawable.rising_sun, getString(R.string.uri_rising_sum)));

        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), pubsList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Description pub = (pubsList.get(position));
                String pubIndex = pub.getUrl();
                Uri uri = Uri.parse(pubIndex);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        return rootView;
    }
}



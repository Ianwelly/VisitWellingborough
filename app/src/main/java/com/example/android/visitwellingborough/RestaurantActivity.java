package com.example.android.visitwellingborough;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        final ArrayList<Description> restaurant = new ArrayList<>(10);

        //String [] restaurants = new String[10];

        restaurant.add(new Description(getString(R.string.text_view_title_pizza_hut),
                getString(R.string.text_view_info_pizza_hut), R.drawable.pizza_hut, getString(R.string.uri_pizza_hut)));
        restaurant.add(new Description(getString(R.string.text_view_title_yumeijin),
                getString(R.string.text_view_info_yumeijin), R.drawable.yumeijin, getString(R.string.uri_yumeijin)));
        restaurant.add(new Description(getString(R.string.text_view_title_McDonalds),
                getString(R.string.text_view_info_McDonalds), R.drawable.mcdonalds, getString(R.string.uri_macdonalds)));
        restaurant.add(new Description(getString(R.string.text_view_title_kfc) ,
                getString(R.string.text_view_info_kfc),R.drawable.kfc, getString(R.string.uri_kfc)));
        restaurant.add(new Description(getString(R.string.text_view_title_la_roca),
                getString(R.string.text_view_info_la_roca), R.drawable.la_roca, getString(R.string.uri_la_roca)));
        restaurant.add(new Description(getString(R.string.text_view_title_jennys),
                getString(R.string.text_view_info_jennys), R.drawable.jennys, getString(R.string.uri_jennys)));
        restaurant.add(new Description(getString(R.string.text_view_title_castello),
                getString(R.string.text_view_info_castello),
                R.drawable.castello_lounge, getString(R.string.uri_castello_lounge)));
        restaurant.add(new Description(getString(R.string.text_view_title_voujon),
                getString(R.string.text_view_info_voujon), R.drawable.voujon, getString(R.string.uri_voujon)));
        restaurant.add(new Description(getString(R.string.text_view_title_alis),
                getString(R.string.text_view_info_alis), R.drawable.alis, getString(R.string.uri_alis)));
        restaurant.add(new Description(getString(R.string.text_view_title_jam_rock),
                getString(R.string.text_view_info_jam_rock), R.drawable.jamrock, getString(R.string.uri_jamrock)));

        DescriptionAdapter adapter = new DescriptionAdapter (this, restaurant);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Description restaurantIndex = (restaurant.get(position));
                String restaurantIndexUrl = restaurantIndex.getUrl();
                Uri uri = Uri.parse(restaurantIndexUrl);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
    }
}

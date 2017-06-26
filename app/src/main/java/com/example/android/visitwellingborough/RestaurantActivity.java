package com.example.android.visitwellingborough;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ArrayList<Description> restaurant = new ArrayList<>(10);

        //String [] restaurants = new String[10];

        restaurant.add(new Description(getString(R.string.text_view_title_pizza_hut),
                getString(R.string.text_view_info_pizza_hut), R.drawable.pizza_hut));
        restaurant.add(new Description(getString(R.string.text_view_title_yumeijin),
                getString(R.string.text_view_info_yumeijin), R.drawable.yumeijin));
        restaurant.add(new Description(getString(R.string.text_view_title_McDonalds),
                getString(R.string.text_view_info_McDonalds), R.drawable.mcdonalds));
        restaurant.add(new Description(getString(R.string.text_view_title_kfc) ,
                getString(R.string.text_view_info_kfc),R.drawable.kfc));
        restaurant.add(new Description(getString(R.string.text_view_title_la_roca),
                getString(R.string.text_view_info_la_roca), R.drawable.la_roca));
        restaurant.add(new Description(getString(R.string.text_view_title_jennys),
                getString(R.string.text_view_info_jennys), R.drawable.jennys));
        restaurant.add(new Description(getString(R.string.text_view_title_castello),
                getString(R.string.text_view_info_castello),
                R.drawable.castello_lounge));
        restaurant.add(new Description(getString(R.string.text_view_title_voujon),
                getString(R.string.text_view_info_voujon), R.drawable.voujon));
        restaurant.add(new Description(getString(R.string.text_view_title_alis),
                getString(R.string.text_view_info_alis), R.drawable.alis));
        restaurant.add(new Description(getString(R.string.text_view_title_jam_rock),
                getString(R.string.text_view_info_jam_rock), R.drawable.jamrock));

        DescriptionAdapter adapter = new DescriptionAdapter (this, restaurant);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

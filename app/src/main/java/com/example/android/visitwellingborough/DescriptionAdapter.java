package com.example.android.visitwellingborough;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kezia on 18/06/2017.
 */

public class DescriptionAdapter extends ArrayAdapter<Description> {

    public DescriptionAdapter(Activity context, ArrayList<Description> pubsList) {
        super(context, 0, pubsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //fetches the Description object at this view i.e. index 1 in the pubsList is the Cannon
        Description currentDescription = getItem(position);

        //uses the recycled view if there is one. If not then a new one is inflated.
        //from the custom view xml layout called list_item
        View descriptionView = convertView;
        if (descriptionView == null) {
            descriptionView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        //Title
        //find the title text view inside the list_item layout and inflate a TextView for it
        TextView titleTextView = (TextView) descriptionView.findViewById(R.id.text_view_title);

        //populate the title text view with the text from the object we found at index 1 using
        //the getTitle method. In the case of pubsList this is the String "The Cannon, town centre"
        titleTextView.setText(currentDescription.getTitle());

        //Info
        //find the info text view inside the list_item_layout and and store it in an
        // inflated  TextView
        TextView infoTextView = (TextView) descriptionView.findViewById(R.id.text_view_info);

        //populate the info text view with text from the object we found at index 1 using
        //the getInfo method. In the case of the publist this is the String "Sells a large range of
        // real ales including Adnams Broadside and Young\'s Special, NN8 4DJ"
        infoTextView.setText(currentDescription.getInfo());

        ImageView imageView = (ImageView) descriptionView.findViewById(R.id.image_view);
        imageView.setImageResource(currentDescription.getImageResourceId());

        return descriptionView;
    }
}

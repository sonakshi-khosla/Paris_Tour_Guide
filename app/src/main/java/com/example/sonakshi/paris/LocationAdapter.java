package com.example.sonakshi.paris;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sonakshi on 06-07-2018.
 */

public class LocationAdapter extends ArrayAdapter<Location>{

    private int mColorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> location, int colorResourceId) {
        super(context, 0, location);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        nameTextView.setText(currentLocation.getName());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.location_description);
        descTextView.setText(currentLocation.getDescription());

        TextView addTextView = (TextView) listItemView.findViewById(R.id.location_address);
        addTextView.setText(currentLocation.getAddress());

        TextView schTextView = (TextView) listItemView.findViewById(R.id.location_schedule);
        schTextView.setText(currentLocation.getSchedule());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.location_phone);
        phoneTextView.setText(currentLocation.getPhone());

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.location_price);
        priceTextView.setText(currentLocation.getPrice());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentLocation.getImageResourceId());

        if (currentLocation.hasImage()){
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
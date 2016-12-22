package com.example.android.madridtourguideapp;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link MadridAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Madrid} objects.
 **/
public class MadridAdapter extends ArrayAdapter<Madrid> {

    // Setting resource ID for colors on each activity, although ended up using same color on each
    private int mColorResourceId;

    /**
     * Create a new {@link MadridAdapter} object.
     *
     * @param context         is the current context of activity.
     * @param madrids         is the list of {@link Madrid}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for the activities
     */
    public MadridAdapter(Context context, ArrayList<Madrid> madrids, int colorResourceId) {
        super(context, 0, madrids);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // Get the {@link Madrid} object located at this position in the list
        Madrid currentMadrid = getItem(position);

        // Find the TextView in the list_items.xml layout with the ID name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Setting text of .name
        nameTextView.setText(currentMadrid.getmName());

        // Finding the TextView in the list_items.xml layout with the ID location
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Setting the text of .location
        locationTextView.setText(currentMadrid.getmLocation());

        // Finding the TextView in list_items.xml layout with ID of details
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.details);
        // Check if details are provided or not
        if (currentMadrid.hasDetails()) {
            // If details available, display the details in the TextView
            defaultTextView.setText(currentMadrid.getmDetails());
            // Make sure the view is visible
            defaultTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hiding the TextView via GONE
            defaultTextView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_items.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is included or not
        if (currentMadrid.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentMadrid.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView via GONE
            imageView.setVisibility(View.GONE);
        }

        // Find the phoneView in the list_items.xml layout with the ID phone.
        TextView phoneView = (TextView) listItemView.findViewById(R.id.phone);
        // Check if a phone number is included
        if (currentMadrid.hasPhone()) {
            // If phone number included, getting it
            phoneView.setText(currentMadrid.getmPhoneNumber());
            // Making sure the view is visible
            phoneView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hiding the phoneView via GONE
            phoneView.setVisibility(View.GONE);
        }

        // Setting theme color
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

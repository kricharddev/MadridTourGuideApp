package com.example.android.madridtourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the events category
        TextView events = (TextView) findViewById(R.id.events);

        // Set a click listener on that View
        events.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the events category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsActivity}
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);

                // Start the new activity
                startActivity(eventsIntent);
            }
        });

        // Find the View that shows the History category
        final TextView history = (TextView) findViewById(R.id.history);

        // Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the history category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HistoryActivity}
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);

                // Start the new activity
                startActivity(historyIntent);
            }
        });

        // Find the View that shows the Hotels category
        TextView hotels = (TextView) findViewById(R.id.hotels);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Hotels category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HotelsActivity}
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);

                // Start the new activity
                startActivity(hotelsIntent);
            }
        });

        // Find the View that shows the Restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });
    }
}

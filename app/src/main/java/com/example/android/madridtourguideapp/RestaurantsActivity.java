package com.example.android.madridtourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madrid_list);
        // Creating list of Restaurants
        final ArrayList<Madrid> madrids = new ArrayList<Madrid>();
        madrids.add(new Madrid(R.string.restaurants_oneName, R.string.restaurants_oneDetails,
                R.string.restaurants_onePhone));
        madrids.add(new Madrid(R.string.restaurants_twoName, R.string.restaurants_twoDetails,
                R.string.restaurants_twoPhone));
        madrids.add(new Madrid(R.string.restaurants_threeName, R.string.restaurants_threeDetails,
                R.string.restaurants_threePhone));
        madrids.add(new Madrid(R.string.restaurants_fourName, R.string.restaurants_fourDetails,
                R.string.restaurants_fourPhone));
        madrids.add(new Madrid(R.string.restaurants_fiveName, R.string.restaurants_fiveDetails,
                R.string.restaurants_fivePhone));
        // Setting up Adapter
        MadridAdapter adapter = new MadridAdapter(this, madrids, R.color.colorRestaurants);
        // Pairing to listView
        ListView listView = (ListView) findViewById(R.id.list);
        // Outputting to listView
        listView.setAdapter(adapter);
    }
}

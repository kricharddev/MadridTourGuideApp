package com.example.android.madridtourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madrid_list);

        // Creating list of Hotels
        final ArrayList<Madrid> madrids = new ArrayList<Madrid>();
        madrids.add(new Madrid(R.string.hotels_oneName, R.string.hotels_oneLocation,
                R.string.hotels_onePhone, R.drawable.ritz_madrid));
        madrids.add(new Madrid(R.string.hotels_twoName, R.string.hotels_twoLocation,
                R.string.hotels_twoPhone, R.drawable.me_madrid));
        madrids.add(new Madrid(R.string.hotels_threeName, R.string.hotels_threeLocation,
                R.string.hotels_threePhone, R.drawable.westin_madrid));
        madrids.add(new Madrid(R.string.hotels_fourName, R.string.hotels_fourLocation,
                R.string.hotels_fourPhone, R.drawable.letras_madrid2));
        madrids.add(new Madrid(R.string.hotels_fiveName, R.string.hotels_fiveLocation,
                R.string.hotels_fivePhone, R.drawable.urban_madrid));

        // Creating adapter
        MadridAdapter adapter = new MadridAdapter(this, madrids, R.color.colorHotels);

        // Finding listView
        ListView listView = (ListView) findViewById(R.id.list);

        // Pairing listView for output of adapter
        listView.setAdapter(adapter);
    }
}

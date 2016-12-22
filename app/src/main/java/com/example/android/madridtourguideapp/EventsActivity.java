package com.example.android.madridtourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madrid_list);

// Creating a list for Events
        final ArrayList<Madrid> madrids = new ArrayList<>();
        madrids.add(new Madrid(R.string.event_oneName, R.string.event_oneLocation,
                R.string.event_oneDetails));
        madrids.add(new Madrid(R.string.event_twoName, R.string.event_twoLocation,
                R.string.event_twoDetails));
        madrids.add(new Madrid(R.string.event_threeName, R.string.event_threeLocation,
                R.string.event_threeDetails));
        madrids.add(new Madrid(R.string.event_fourName, R.string.event_fourLocation,
                R.string.event_fourDetails));
        madrids.add(new Madrid(R.string.event_fiveName, R.string.event_fiveLocation,
                R.string.event_fiveDetails));

        // Create an {@link MadridAdapter}, whose data source is a list of {@link Madrid}s. The
        // adapter knows how to create list items for each item in the list.
        MadridAdapter adapter = new MadridAdapter(this, madrids, R.color.colorEvents);

        // Finding the list view
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link MadridAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}

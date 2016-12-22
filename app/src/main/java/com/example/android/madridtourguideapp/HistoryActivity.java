package com.example.android.madridtourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kyle on 12/20/16.
 */

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madrid_list);

// Creating Historic Places list
        final ArrayList<Madrid> madrids = new ArrayList<Madrid>();
        madrids.add(new Madrid(R.string.history_oneName, R.string.history_oneLocation,
                R.string.history_oneDetails));
        madrids.add(new Madrid(R.string.history_twoName, R.string.history_twoLocation,
                R.string.history_twoDetails));
        madrids.add(new Madrid(R.string.history_threeName, R.string.history_threeLocation,
                R.string.history_threeDetails));
        madrids.add(new Madrid(R.string.history_fourName, R.string.history_fourLocation,
                R.string.history_fourDetails));

        // Creating adapter
        MadridAdapter adapter = new MadridAdapter(this, madrids, R.color.colorHistory);
        // Finding where listView is
        ListView listView = (ListView) findViewById(R.id.list);
        // Outputting adapter to listView
        listView.setAdapter(adapter);
    }
}

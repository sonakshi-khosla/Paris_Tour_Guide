package com.example.sonakshi.paris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ArrayList<Location> Content = new ArrayList<Location>();

        Content.add(new Location(getString(R.string.internet_info_name), getString(R.string.internet_info_desc)));
        Content.add(new Location(getString(R.string.con_info_name), getString(R.string.con_info_desc)));
        Content.add(new Location(getString(R.string.travel_info_name), getString(R.string.travel_info_desc)));

        LocationAdapter adapter = new LocationAdapter(this, Content, R.color.info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

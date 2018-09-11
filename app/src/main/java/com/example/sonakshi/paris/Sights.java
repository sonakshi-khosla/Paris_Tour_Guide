package com.example.sonakshi.paris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Sights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);

        ArrayList<Location> Content = new ArrayList<Location>();

        Content.add(new Location(getString(R.string.eifel_sight_name), getString(R.string.eifel_sight_desc),
                getString(R.string.eifel_sight_address),getString(R.string.eifel_sight_phone),
                getString(R.string.eifel_sight_sch),getString(R.string.eifel_sight_price), R.drawable.eifel));
        Content.add(new Location(getString(R.string.arc_sight_name), getString(R.string.arc_sight_desc),
                getString(R.string.arc_sight_add), getString(R.string.arc_sight_phone), getString(R.string.arc_sight_sch),
                getString(R.string.arc_sight_price), R.drawable.arc_de_triomphe_paris));
        Content.add(new Location(getString(R.string.notre_sight_name), getString(R.string.notre_sight_desc),
                getString(R.string.notre_sight_add), getString(R.string.notre_sight_phone),
                getString(R.string.notre_sight_sch), getString(R.string.notre_sight_price), R.drawable.notre_dam));
        Content.add(new Location(getString(R.string.lov_sight_name), getString(R.string.lov_sight_desc),
                getString(R.string.lov_sight_add), getString(R.string.lov_sight_phone), getString(R.string.lov_sight_sch),
                getString(R.string.lov_sight_price), R.drawable.louvre));
        Content.add(new Location(getString(R.string.pal_sight_name),getString(R.string.pal_sight_desc),
                getString(R.string.pal_sight_add), getString(R.string.pal_sight_phone),getString(R.string.pal_sight_sch),
                getString(R.string.pal_sight_price), R.drawable.palace_of_versailles));

        LocationAdapter adapter = new LocationAdapter(this, Content, R.color.sights);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

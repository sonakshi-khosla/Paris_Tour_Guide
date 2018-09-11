package com.example.sonakshi.paris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ArrayList<Location> Content = new ArrayList<Location>();

        Content.add(new Location(getString(R.string.au_food_name), getString(R.string.au_food_desc),
                getString(R.string.au_food_add), getString(R.string.au_food_phone), getString(R.string.au_food_sch),
                getString(R.string.au_food_price), R.drawable.au_paris));
        Content.add(new Location(getString(R.string.ur_food_name), getString(R.string.ur_food_desc), getString(R.string.ur_food_add),
                getString(R.string.ur_food_phone), getString(R.string.ur_food_sch), getString(R.string.ur_food_price), R.drawable.urfa));
        Content.add(new Location(getString(R.string.fal_food_name), getString(R.string.fal_food_desc), getString(R.string.fal_food_add),
                getString(R.string.fal_food_phone), getString(R.string.fal_food_sch), getString(R.string.fal_food_price), R.drawable.fallafel));
        Content.add(new Location(getString(R.string.berth_food_name), getString(R.string.berth_food_desc), getString(R.string.berth_food_add),
                getString(R.string.beth_food_phone), getString(R.string.berth_food_sch),getString(R.string.berth_food_price), R.drawable.berth));
        Content.add(new Location(getString(R.string.ang_food_name), getString(R.string.ang_food_desc), getString(R.string.ang_food_add),
                getString(R.string.ang_food_phone), getString(R.string.ang_food_sch), getString(R.string.ang_food_price), R.drawable.angelina));

        LocationAdapter adapter = new LocationAdapter(this, Content, R.color.food);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

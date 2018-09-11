package com.example.sonakshi.paris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Shops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);

        ArrayList<Location> Shop = new ArrayList<Location>();

        Shop.add(new Location(getString(R.string.kilo_shop_name), getString(R.string.kilo_shop_desc),
                getString(R.string.kilo_shop_add), getString(R.string.kilo_shop_phone),
                getString(R.string.kilo_shop_sch), getString(R.string.kilo_shop_price), R.drawable.shop_kilo));
        Shop.add(new Location(getString(R.string.born_shop_name), getString(R.string.born_shop_desc),
                getString(R.string.born_shop_add), getString(R.string.born_shop_phone),
                getString(R.string.born_shop_sch), getString(R.string.born_shop_price), R.drawable.born_bad));
        Shop.add(new Location(getString(R.string.par_shop_name), getString(R.string.par_shop_desc),
                getString(R.string.par_shop_add), getString(R.string.par_shop_phone), getString(R.string.par_shop_sch),
                getString(R.string.par_shop_price), R.drawable.rendez_vous));
        Shop.add(new Location(getString(R.string.whisk_shop_name), getString(R.string.whisk_shop_desc),
                getString(R.string.whisk_shop_add),getString(R.string.whisk_shop_phone), getString(R.string.whisk_shop_sch),
                getString(R.string.whisk_shop_price), R.drawable.whisky_shop));

        LocationAdapter adapter = new LocationAdapter(this, Shop, R.color.shops);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

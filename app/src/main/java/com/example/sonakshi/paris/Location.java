package com.example.sonakshi.paris;

import android.util.Log;

/**
 * Created by sonakshi on 05-07-2018.
 */

public class Location {
    private String name;
    private String description;
    private String address;
    private String phone;
    private String schedule;
    private String price;
    private static final int NO_IMAGE_PROVIDED = 0;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Location(String name, String description, String address, String phone, String schedule,
                    String price, int imageResourceId)
     {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public Location(String name, String description, String address, String phone, String schedule,
                    String price)
    {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.price = price;
    }

    public Location(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchedule() {
        return schedule;
    }
    public boolean hasImage(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getPrice() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId()
                ;

        return output;
    }

}

      

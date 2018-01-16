package com.example.pankaj.recyclerviewdemo;

/**
 * Created by Pankaj on 12-01-2018.
 */

public class Data {

    private int imageID;
    private String description;

    public Data(int imageID, String description) {
        this.imageID = imageID;
        this.description = description;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

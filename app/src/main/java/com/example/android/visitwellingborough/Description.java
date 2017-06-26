package com.example.android.visitwellingborough;

/**
 * Created by Kezia on 17/06/2017.
 */

public class Description {

    //private member variables
    private String mTitle;
    private String mInfo;
    private int mImageResourceId;

    //Constructors
    public Description (String title, String info) {
        mTitle = title;
        mInfo = info;
    }

    public Description (String title, String info, int imageResourceId) {
        mTitle = title;
        mInfo = info;
        mImageResourceId = imageResourceId;
    }

    //getters
    public String getTitle (){
        return mTitle;
    }

    public String getInfo () {
        return  mInfo;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    //toString
    @Override
    public String toString (){
        return "Title is " + mTitle + " and info is " + mInfo;
    }
}

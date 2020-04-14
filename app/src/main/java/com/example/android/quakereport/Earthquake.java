package com.example.android.quakereport;

public class Earthquake {

    private String mLocation;
    private long mTimeInMilliseconds;
    private double mMagnitude;
    private String mUrl;

    public Earthquake(double magnitude, String location, long TimeInMilliseconds,String url){
      mMagnitude = magnitude;
      mLocation = location;
      mTimeInMilliseconds = TimeInMilliseconds;
      mUrl = url;
    };

    public double getmMagnitude(){
        return mMagnitude;
    }

    public String getmLocation(){
        return mLocation;
    }

    public long getmTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}

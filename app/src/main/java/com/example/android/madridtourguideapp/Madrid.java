package com.example.android.madridtourguideapp;

public class Madrid {

    // Creating Lat/Long objects for tracking
    private double Longitude;
    private double Latitude;

    public double getLongitude() {
        return Longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    private int mName;

    private int mLocation = NO_LOCATION_PROVIDED;
    private static final int NO_LOCATION_PROVIDED = -1;

    private int mDetails = NO_DETAILS_PROVIDED;
    private static final int NO_DETAILS_PROVIDED = -1;

    private int mPhoneNumber = NO_NUMBER_PROVIDED;
    private static final int NO_NUMBER_PROVIDED = -1;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Creating new Madrid object.
     *
     * @param name     is name of event/hotel/restaurant/site
     * @param location is typically the address or a specific part of Madrid
     * @param details  is additional info about the place or event
     */
    public Madrid(int name, int location, int details) {
        mName = name;
        mLocation = location;
        mDetails = details;
    }

    /**
     * Create a new Madrid object.
     *
     * @param name            is name of event/hotel/restaurant/site
     * @param location        is typically the address or a specific part of Madrid
     * @param imageResourceId is the resource ID for the image file
     * @param phoneNumber     is the phone number of place/event
     */
    public Madrid(int name, int location, int phoneNumber, int imageResourceId) {
        mName = name;
        mLocation = location;
        mPhoneNumber = phoneNumber;
        mImageResourceId = imageResourceId;
    }

    // Getters needed for data output from lists
    public int getmName() {
        return mName;
    }

    // Returns only if there is details info in list
    public int getmDetails() {
        return mDetails;
    }

    public boolean hasDetails() {
        return mDetails != NO_DETAILS_PROVIDED;
    }

    // Returns only if there is location info in list
    public int getmLocation() {
        return mLocation;
    }

    public boolean hasLocation() {
        return mLocation != NO_LOCATION_PROVIDED;
    }

    // Returns if there is an image in list
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    // Only returns if there is a phone number in list
    public int getmPhoneNumber() {
        return mPhoneNumber;
    }

    public boolean hasPhone() {
        return mPhoneNumber != NO_NUMBER_PROVIDED;
    }
}

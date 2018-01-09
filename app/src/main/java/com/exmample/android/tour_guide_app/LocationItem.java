package com.exmample.android.tour_guide_app;

public class LocationItem {

    private String title = "";
    private String address = "";
    private String phoneNumber = "";
    private String website = "";
    private int imageResource;

    public LocationItem(String title, String address, String phoneNumber, String website, int imageResource) {
        this.title = title;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public int getImageResource() {
        return imageResource;
    }

}

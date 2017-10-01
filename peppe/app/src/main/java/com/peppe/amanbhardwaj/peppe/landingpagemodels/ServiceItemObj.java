package com.peppe.amanbhardwaj.peppe.landingpagemodels;

import com.peppe.amanbhardwaj.peppe.bizobj.Services;

/**
 * Created by amanbhardwaj on 9/23/17.
 */

public class ServiceItemObj {


    private String subcategory;
    private String title;
    private String charges;
    private String url;
    private int rating;
    private int reviewCount;

    public ServiceItemObj() {
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

}

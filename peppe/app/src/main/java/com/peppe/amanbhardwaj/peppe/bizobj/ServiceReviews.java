package com.peppe.amanbhardwaj.peppe.bizobj;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 24/08/17.
 */

public class ServiceReviews implements BizObj{

    private int serviceEntityID;
    private int userID;

    private int rating;
    private String description;

    public int getServiceEntityID() {
        return serviceEntityID;
    }

    public void setServiceEntityID(int serviceEntityID) {
        this.serviceEntityID = serviceEntityID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> reviewMap = new HashMap<>();

        reviewMap.put("serviceEntityID",this.serviceEntityID);
        reviewMap.put("userID",this.userID);
        reviewMap.put("rating",this.rating);
        reviewMap.put("description",this.description);


        return reviewMap;
    }
}

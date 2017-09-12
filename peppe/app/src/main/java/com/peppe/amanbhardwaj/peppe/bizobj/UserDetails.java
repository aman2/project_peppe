package com.peppe.amanbhardwaj.peppe.bizobj;

import org.json.JSONException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 24/08/17.
 */

public class UserDetails implements BizObj{

    private String userName;
    private int userID;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Map<String, Object> toMap() {
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("userID",this.userID);
        userMap.put("userName",this.userName);

        return userMap;
    }
}

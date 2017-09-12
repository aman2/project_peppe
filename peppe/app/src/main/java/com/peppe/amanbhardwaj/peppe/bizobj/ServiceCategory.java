package com.peppe.amanbhardwaj.peppe.bizobj;

import org.json.JSONException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 29/08/17.
 */

public class ServiceCategory implements BizObj{

    private int categoryID;
    private String serviceCategoryName;
    private String mDisplayPic;
    private int totalActiveDeals;
    private Date validFrom;
    private Date validTo;

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getServiceCategoryName() {
        return serviceCategoryName;
    }

    public void setServiceCategoryName(String serviceCategoryName) {
        this.serviceCategoryName = serviceCategoryName;
    }

    public String getmDisplayPic() {
        return mDisplayPic;
    }

    public void setmDisplayPic(String mDisplayPic) {
        this.mDisplayPic = mDisplayPic;
    }

    public int getTotalActiveDeals() {
        return totalActiveDeals;
    }

    public void setTotalActiveDeals(int totalActiveDeals) {
        this.totalActiveDeals = totalActiveDeals;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public Map<String, Object> toMap()  {
        Map<String,Object> serviceCategoryMap = new HashMap<>();
        serviceCategoryMap.put("categoryID",this.categoryID);
        serviceCategoryMap.put("serviceCategoryName",this.serviceCategoryName);
        serviceCategoryMap.put("totalActiveDeals",this.totalActiveDeals);
        serviceCategoryMap.put("valid_from",this.validFrom);
        serviceCategoryMap.put("valid_to",this.validTo);

        return serviceCategoryMap;
    }
}
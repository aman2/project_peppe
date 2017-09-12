package com.peppe.amanbhardwaj.peppe.bizobj;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 24/08/17.
 */

public class Offers implements BizObj {

    private int categoryID;
    private int entityID;
    private int serviceID;
    private String offerType;
    private String durationType;
    private boolean isLimitedOffer;
    private Date offerValidFrom;
    private Date offerValidTo;
    private int discountInPercent;
    private double flatDiscount;

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getEntityID() {
        return entityID;
    }

    public void setEntityID(int entityID) {
        this.entityID = entityID;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public boolean isLimitedOffer() {
        return isLimitedOffer;
    }

    public void setLimitedOffer(boolean limitedOffer) {
        isLimitedOffer = limitedOffer;
    }

    public Date getOfferValidFrom() {
        return offerValidFrom;
    }

    public void setOfferValidFrom(Date offerValidFrom) {
        this.offerValidFrom = offerValidFrom;
    }

    public Date getOfferValidTo() {
        return offerValidTo;
    }

    public void setOfferValidTo(Date offerValidTo) {
        this.offerValidTo = offerValidTo;
    }

    public int getDiscountInPercent() {
        return discountInPercent;
    }

    public void setDiscountInPercent(int discountInPercent) {
        this.discountInPercent = discountInPercent;
    }

    public double getFlatDiscount() {
        return flatDiscount;
    }

    public void setFlatDiscount(double flatDiscount) {
        this.flatDiscount = flatDiscount;
    }

    @Override
    public Map<String, Object> toMap() {

        Map<String,Object> offersMap = new HashMap<>();

        offersMap.put("entityID",this.entityID);
        offersMap.put("serviceID",this.serviceID);
        offersMap.put("categoryID",this.categoryID);
        offersMap.put("offerType",this.offerType);
        offersMap.put("isLimitedOffer",this.isLimitedOffer);
        offersMap.put("offerValidFrom",this.offerValidFrom);
        offersMap.put("offerValidTo",this.offerValidTo);
        offersMap.put("discountInPercent",this.discountInPercent);
        offersMap.put("flatDiscount",this.flatDiscount);

        return offersMap;
    }
}

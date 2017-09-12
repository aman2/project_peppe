package com.peppe.amanbhardwaj.peppe.bizobj;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 24/08/17.
 */

public class Reservations implements BizObj {

    private int entityID;
    private int userID;
    private int petID;
    private Date checkin_Date;
    private Date checkout_Date;
    private boolean isAccepted;
    private Double payments;
    private String paymentType;

    public int getEntityID() {
        return entityID;
    }

    public void setEntityID(int entityID) {
        this.entityID = entityID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public Date getCheckin_Date() {
        return checkin_Date;
    }

    public void setCheckin_Date(Date checkin_Date) {
        this.checkin_Date = checkin_Date;
    }

    public Date getCheckout_Date() {
        return checkout_Date;
    }

    public void setCheckout_Date(Date checkout_Date) {
        this.checkout_Date = checkout_Date;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public Double getPayments() {
        return payments;
    }

    public void setPayments(Double payments) {
        this.payments = payments;
    }

    public String isPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> reservationMap = new HashMap<>();
        reservationMap.put("entityID",this.entityID);
        reservationMap.put("userID",this.userID);
        reservationMap.put("petID",this.petID);
        reservationMap.put("checkin_Date",this.checkin_Date);
        reservationMap.put("checkout_Date",this.checkout_Date);
        reservationMap.put("isAccepted",this.isAccepted);
        reservationMap.put("payments",this.payments);
        reservationMap.put("paymentType",this.paymentType);

        return reservationMap;

    }
}

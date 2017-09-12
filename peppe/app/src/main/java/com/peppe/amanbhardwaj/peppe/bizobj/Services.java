package com.peppe.amanbhardwaj.peppe.bizobj;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 24/08/17.
 */

public class Services implements BizObj{

    private int serviceID;
    private int entityID;
    private String serviceType;
    private boolean isPackage;
    private String serviceName;
    private String serviceDescription;
    private double charges;
    private Date validFrom;
    private Date validTo;

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public int getEntityID() {
        return entityID;
    }

    public void setEntityID(int entityID) {
        entityID = entityID;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isPackage() {
        return isPackage;
    }

    public void setPackage(boolean aPackage) {
        isPackage = aPackage;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
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

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> serviceMap = new HashMap<>();

        serviceMap.put("entityID",this.entityID);
        serviceMap.put("serviceID",this.serviceID);
        serviceMap.put("serviceType",this.serviceType);
        serviceMap.put("serviceName",this.serviceName);
        serviceMap.put("serviceDescription",this.serviceDescription);
        serviceMap.put("isPackage",this.isPackage);
        serviceMap.put("charges",this.charges);
        serviceMap.put("validFrom",this.validFrom);
        serviceMap.put("validTo",this.validTo);

        return serviceMap;
    }
}

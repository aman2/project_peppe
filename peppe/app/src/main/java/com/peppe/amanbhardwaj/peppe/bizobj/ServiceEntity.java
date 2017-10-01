package com.peppe.amanbhardwaj.peppe.bizobj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 24/08/17.
 */

public class ServiceEntity implements BizObj{



    private String entityID;
    private String entityName;
    private int ownerID;
    private String Description;
    private String totalCapacity;
    private String serviceType;
    private String subCategoryDesc;
    private List<String> urlsList;

    private List<Services> servicesList;

    private List<ServiceReviews> reviewsList;


    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }


    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public int getUserID() {
        return ownerID;
    }

    public void setUserID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(String totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public List<Services> getServicesList() {
        return servicesList;
    }

    public void setServicesList(List<Services> servicesList) {
        this.servicesList = servicesList;
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> serviceEntityMap = new HashMap<>();

        serviceEntityMap.put("ownerID",this.ownerID);
        serviceEntityMap.put("entityID",this.entityID);
        serviceEntityMap.put("entityName",this.entityName);
        serviceEntityMap.put("Description",this.Description);
        serviceEntityMap.put("totalCapacity",this.totalCapacity);

        return serviceEntityMap;
    }
}

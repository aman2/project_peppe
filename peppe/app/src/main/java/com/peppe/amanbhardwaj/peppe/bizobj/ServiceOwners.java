package com.peppe.amanbhardwaj.peppe.bizobj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 24/08/17.
 */

public class ServiceOwners implements BizObj{

    private int ownerID;
    private String name;
    private String Description;

    private List<ServiceEntity> serviceEntityList;


    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<ServiceEntity> getServiceEntityList() {
        return serviceEntityList;
    }

    public void setServiceEntityList(List<ServiceEntity> serviceEntityList) {
        this.serviceEntityList = serviceEntityList;
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> serviceOwnerMap = new HashMap<>();

        serviceOwnerMap.put("ownerID",this.ownerID);
        serviceOwnerMap.put("name",this.name);
        serviceOwnerMap.put("Description",this.Description);

        return serviceOwnerMap;
    }
}

package com.peppe.amanbhardwaj.peppe.landingpagemodels;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amanbhardwaj on 10/1/17.
 */

public class SectionDataModel {

    private String headerTitle;
    private List<ServiceItemObj> allItemsInSection;
    private String sectionType;


    public SectionDataModel() {

    }
    public SectionDataModel(String headerTitle, ArrayList<ServiceItemObj> allItemsInSection) {
        this.headerTitle = headerTitle;
        this.allItemsInSection = allItemsInSection;
    }



    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public List<ServiceItemObj> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(ArrayList<ServiceItemObj> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

}

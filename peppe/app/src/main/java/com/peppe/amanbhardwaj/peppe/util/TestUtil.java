package com.peppe.amanbhardwaj.peppe.util;

import com.peppe.amanbhardwaj.peppe.bizobj.ServiceCategory;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nshthbhardwaj on 10/09/17.
 */

public class TestUtil {

    public static List<ServiceCategory> getServiceCategoryList(){
        List <ServiceCategory> list = new ArrayList<>();

        ServiceCategory cat1 = new ServiceCategory();
        cat1.setCategoryID(12);
        cat1.setServiceCategoryName("DOG HOSTEL");
        cat1.setTotalActiveDeals(10);

        list.add(cat1);

        ServiceCategory cat2 = new ServiceCategory();
        cat2.setCategoryID(11);
        cat2.setServiceCategoryName("GROOMING");
        cat2.setTotalActiveDeals(10);

        list.add(cat2);

        ServiceCategory cat3 = new ServiceCategory();
        cat3.setCategoryID(13);
        cat3.setServiceCategoryName("PETS DAY CAMPS");
        cat3.setTotalActiveDeals(20);

        list.add(cat3);

        ServiceCategory cat4 = new ServiceCategory();
        cat4.setCategoryID(14);
        cat4.setServiceCategoryName("TRAININGS");
        cat4.setTotalActiveDeals(30);

        list.add(cat4);

        return list;
    }
 }

package com.peppe.amanbhardwaj.peppe.util;

import com.peppe.amanbhardwaj.peppe.bizobj.PetProfile;
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

    public static List<PetProfile> getPetProfiles(){
        List <PetProfile> list = new ArrayList<>();

        PetProfile pet1 = new PetProfile();
        pet1.setPetID(1);
        pet1.setPetName("Jabby");
        pet1.setBreed("German Shefferd");
        pet1.setGender("Female");
        pet1.setAge(9);
        pet1.setUserID(12345);

        list.add(pet1);

        PetProfile pet2 = new PetProfile();
        pet2.setPetID(2);
        pet2.setPetName("Tribe");
        pet2.setBreed("Labrador");
        pet2.setGender("Male");
        pet2.setAge(6);
        pet2.setUserID(12345);

        list.add(pet2);


        PetProfile pet3 = new PetProfile();
        pet3.setPetID(3);
        pet3.setPetName("Hector");
        pet3.setBreed("Labrador");
        pet3.setGender("Male");
        pet3.setAge(6);
        pet3.setUserID(12345);

        list.add(pet3);

        return list;
    }
 }

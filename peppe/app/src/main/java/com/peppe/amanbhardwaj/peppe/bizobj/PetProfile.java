package com.peppe.amanbhardwaj.peppe.bizobj;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nshthbhardwaj on 24/08/17.
 */

public class PetProfile implements BizObj{


    private int userID;
    private int petID;
    private String petName;
    private String description;
    private String petType;
    private String breed;
    private int age;
    private String medicalProfile;
    private String behaviour;
    private String gender;

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

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedicalProfile() {
        return medicalProfile;
    }

    public void setMedicalProfile(String medicalProfile) {
        this.medicalProfile = medicalProfile;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map<String, Object> toMap()  {

        Map<String,Object> petProfileMap = new HashMap<>();
        petProfileMap.put("userID",this.userID);
        petProfileMap.put("petID",this.petID);
        petProfileMap.put("petName",this.petName);
        petProfileMap.put("gender",this.gender);
        petProfileMap.put("petType",this.petType);
        petProfileMap.put("breed",this.breed);
        petProfileMap.put("age",this.age);
        petProfileMap.put("medicalProfile",this.medicalProfile);
        petProfileMap.put("behavior",this.behaviour);

        return petProfileMap;

    }




}

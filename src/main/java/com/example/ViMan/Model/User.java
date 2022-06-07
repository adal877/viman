package com.example.ViMan.Model;

import java.util.List;

public class User extends Person {
    public static List<User> users;
    private String Occupation;
    private String PlaceOfWork;
    public String getOccupation() {
        return Occupation;
    }
    public void setOccupation(String occupation) {
        Occupation = occupation;
    }
    public String getPlaceOfWork() {
        return PlaceOfWork;
    }
    public void setPlaceOfWork(String placeOfWork) {
        PlaceOfWork = placeOfWork;
    }
    public void setName(String name) {
        super.setName(name);
    }
    public String getName() {
        return super.getName();
    }
    public void setgo2Activities(Boolean go2Activities) {
        super.setGo2Activities(go2Activities);
    }
    public Boolean getgo2Activities() {
        return super.getGo2Activities();
    }
}
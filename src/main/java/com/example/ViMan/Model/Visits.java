package com.example.ViMan.Model;

import java.util.List;

public class Visits extends Person {
    public static List<Visits> visits;
    private String Address;
    private String BookStudying;
    private String Observation;
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getBookStudying() {
        return BookStudying;
    }

    public void setBookStudying(String bookStudying) {
        BookStudying = bookStudying;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String observation) {
        Observation = observation;
    }
    public void setName(String name) {
        super.setName(name);
    }
    public String getName() {
        return super.getName();
    }
    public void setAge(int age) {
        super.setAge(age);
    }
    public int getAge() {
        return super.getAge();
    }
    public void setgo2Activities(Boolean go2Activities) {
        super.setGo2Activities(go2Activities);
    }
    public Boolean getgo2Activities() {
        return super.getGo2Activities();
    }
}

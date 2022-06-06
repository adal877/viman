package com.example.sb_test2.Model;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Person {
    private Boolean go2Activities;
    private String Name;
    private int Age;
    private int YearDate;
    public Person(String name, int age) {
        Name = name;
        Age = age;
    }
    public Person(String name) {
        Name = name;
    }
    public Person(int age) {
        Age = age;
    }
    public Person() {

    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getYearDate() {
        LocalDateTime tempDate = LocalDateTime.now().minusYears(getAge());
        Date yearDate = Date.from(tempDate.atZone(ZoneId.systemDefault()).toInstant());
        return yearDate.getYear();
    }

    public void setYearDate(int yearDate) {
        YearDate = yearDate;
    }

    public Boolean getGo2Activities() {
        return go2Activities;
    }

    public void setGo2Activities(Boolean go2Activities) {
        this.go2Activities = go2Activities;
    }
}
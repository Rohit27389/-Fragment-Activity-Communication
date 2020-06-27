package com.rohit.fragment_activity_communication;

/**
 * Created by Rohit Kumar on 18-06-2020.
 */

public class Person {
    private String name;
    private String email;
    private int id;


    protected Person() {

    }

    public Person(String sName, String sEmail, int iId) {
        this.name = sName;
        this.email = sEmail;
        this.id = iId;
    }

    @Override
    public String toString() {
        return this.name + "\n"+ this.email + "\n" +this.id+ "\n" ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }
}
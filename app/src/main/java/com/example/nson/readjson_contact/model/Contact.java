package com.example.nson.readjson_contact.model;

/**
 * Created by NSON on 02/06/2017.
 */

public class Contact {
    String id, name, gender, phoneMobile;

    public Contact() {
    }

    public Contact(String id, String name, String gender, String phoneMobile) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneMobile = phoneMobile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }
}

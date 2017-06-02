package com.example.nson.readjson_contact.model;

/**
 * Created by NSON on 02/06/2017.
 */

public class ContactDetail {

        String id, name, email, address, gender, phoneMobile, phoneHome, phoneOficer;

        public ContactDetail() {
        }
        public ContactDetail(String id, String name, String email, String address, String gender, String phoneMobile, String phoneHome, String phoneOficer) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.address = address;
            this.gender = gender;
            this.phoneMobile = phoneMobile;
            this.phoneHome = phoneHome;
            this.phoneOficer = phoneOficer;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
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

        public String getPhoneHome() {
            return phoneHome;
        }

        public void setPhoneHome(String phoneHome) {
            this.phoneHome = phoneHome;
        }

        public String getPhoneOficer() {
            return phoneOficer;
        }

        public void setPhoneOficer(String phoneOficer) {
            this.phoneOficer = phoneOficer;
        }
    }


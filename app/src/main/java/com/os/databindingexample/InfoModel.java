package com.os.databindingexample;

public class InfoModel {
    String name, sirName, email;

    public InfoModel(String name, String sirName, String email) {
        this.name = name;
        this.sirName = sirName;
        this.email = email;
    }

    public String getName() {
        return name;
    }


    public String getSirName() {
        return sirName;
    }


    public String getEmail() {
        return email;
    }

}

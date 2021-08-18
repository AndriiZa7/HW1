package com.company;

public class CompareNames {
    public String compareTwoName(String firstName, String secondName) {
        if (firstName.equals(secondName)) {
            return "same name";
        } else {
            return "These people aren't same name";
        }
    }
}

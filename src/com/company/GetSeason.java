package com.company;

public class GetSeason {
    public String findSeason(int month, int day) {
        if (month <= 12 && month >= 1) {
            if (month == 1 || month == 2 || month == 12) {
                return "Winter";
            } else if (month >= 3 && month <= 5) {
                return "Spring";
            } else if (month >= 6 && month <= 8) {
                return "Summer";
            } else if (month >= 9 && month <= 11) {
                return "Autumn";
            }
        } else {
            return "Incorrect month";
        }
        if (day >= 1 && day <= 31) {
            return "Day of month is correct";
        } else {
            return "Incorrect day";
        }
    }
}

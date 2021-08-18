package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class GetMinNumber {
    public int findMinNumber(int numOne, int numTwo, int numThree, int numFour) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(numOne);
        listOfNumbers.add(numTwo);
        listOfNumbers.add(numThree);
        listOfNumbers.add(numFour);
        Collections.sort(listOfNumbers);
        int min = listOfNumbers.get(0);
        return min;
    }

    //найти количество всех максимальных чисел
    public ArrayList<Integer> findMaxNumbersOfArray(int numOne, int numTwo, int numThree, int numFour) {
        ArrayList<Integer> listOfNums = new ArrayList<>();
        ArrayList<Integer> listOfMaxNums = new ArrayList<>();
        listOfNums.add(numOne);
        listOfNums.add(numTwo);
        listOfNums.add(numThree);
        listOfNums.add(numFour);
        int max = listOfNums.get(0);
        for (int i = 1; i < listOfNums.size(); i++) {
            if (listOfNums.get(i) > max) {
                max = listOfNums.get(i);
                listOfMaxNums.add(max);
            }
        }
        return listOfMaxNums;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class GetMaxAndMinNumbers {
    public int findMinNumbers(int numOne, int numTwo, int numThree, int numFour, int numFive) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(numOne);
        listOfNumbers.add(numTwo);
        listOfNumbers.add(numThree);
        listOfNumbers.add(numFour);
        listOfNumbers.add(numFive);
        Collections.sort(listOfNumbers);
        int min = listOfNumbers.get(0);
        return min;
    }
    public int findMaxNumbers(int numOne, int numTwo, int numThree, int numFour, int numFive){
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(numOne);
        listOfNumbers.add(numTwo);
        listOfNumbers.add(numThree);
        listOfNumbers.add(numFour);
        listOfNumbers.add(numFive);
        Collections.sort(listOfNumbers);
        int max = listOfNumbers.get(4);
        return max;
    }
}

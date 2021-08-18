package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        GetMinNumber getMinNumber = new GetMinNumber();
        GetMaxAndMinNumbers getMaxAndMinNumbers = new GetMaxAndMinNumbers();
        CompareNames compareNames = new CompareNames();
        GetSeason getSeason = new GetSeason();
        Scanner in = new Scanner(System.in);

        //1) Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
        System.out.println("Enter number one");
        int numOne = in.nextInt();
        System.out.println("Enter number two");
        int numTwo = in.nextInt();
        System.out.println("Enter number three");
        int numThree = in.nextInt();
        System.out.println("Enter number four");
        int numFour = in.nextInt();
        int MinNumbers = getMinNumber.findMinNumber(numOne,numTwo,numThree,numFour);
        System.out.println(MinNumbers);

        //2) Вывести на консоль максимальное из этих чисел и их количество.
        ArrayList<Integer> result = getMinNumber.findMaxNumbersOfArray(numOne,numTwo,numThree,numFour);
        System.out.println("MAXIMUM is " + result);

        //3)Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел
        System.out.println("Enter number five");
        int numFive = in.nextInt();
        int resultMinNumbers = getMaxAndMinNumbers.findMinNumbers(numOne, numTwo, numThree, numFour, numFive);
        System.out.println("Min number is " + resultMinNumbers);
        int resultMaxNumbers = getMaxAndMinNumbers.findMaxNumbers(numOne, numTwo, numThree, numFour, numFive);
        System.out.println("Max number is " + resultMaxNumbers);

        //4)Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками
        System.out.println("Enter first name");
        String firstName = in.nextLine();
        System.out.println("Enter second name");
        String secondName = in.nextLine();
        String resultOfComparing = compareNames.compareTwoName(firstName, secondName);
        System.out.println(resultOfComparing);

       //5)Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
        System.out.println("Enter month");
        int month = in.nextInt();
        System.out.println("Enter day");
        int day = in.nextInt();
        String resultGetSeason = getSeason.findSeason(month,day);
        System.out.println(resultGetSeason);
    }
}

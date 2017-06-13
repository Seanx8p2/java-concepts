package com.sean;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);      //Accepts user input
    private static int[] baseData = new int[10];            //Array of 10 elements

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        baseData[10] = 67;                                  //Adds two elements to the saved array with 10 elements
        baseData[11] = 34;
        printArray(baseData);

    }

    private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)        //Gets the input and saves it in the array
            baseData[i] = s.nextInt();
    }

    private static void printArray(int[] arr)           //
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray()                   //Takes the "base data" or copy of an array and loops each element of the copy and puts it in the new array
    {
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }

}
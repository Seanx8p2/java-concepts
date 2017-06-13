// Test git comment
package com.sean;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);            //For system input

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myIntegers = getIntegers(5);                  //method being called for determining arrary length
        int[] sorted = sortIntegers(myIntegers);                    //method for sorting the user input passed in the getIntegers method
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {                 //method for determining array length
        int[] array = new int[capacity];                            //initializing the new array
        System.out.println("Enter " + capacity +" integer values:\r");      //system print out for determined array length
        for(int i=0; i<array.length; i++) {                                 //Array for loop for accepting input
            array[i] = scanner.nextInt();
        }
        return array;                                               //returns the array back to where the method was called
    }

    public static void printArray(int[] array) {                    //Method for printing the user input for each element in the array
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {                 //Method(s) for sorting arrays: accepts the array above that's passed to it
//        int[] sortedArray = new int[array.length];                //creating an array that's the exact same size as the above array
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);     //Native method to copy a previously created array

        boolean flag = true;                                        //Continues processing until false
        int smallerNumber;
        while(flag) {                                               //Continous until flag is true
            flag = false;                                           //set to false to continue until flag is true
            // element 0     160
            // element 1     50
            // element 2     40

            for(int i=0; i<sortedArray.length-1; i++) {             //
                if(sortedArray[i] < sortedArray[i+1]) {             //If the element in the next position  is bigger,
                    smallerNumber = sortedArray[i];                          //Swap the element position
                    sortedArray[i] = sortedArray[i+1];              //
                    sortedArray[i+1] = smallerNumber;                        //
                    flag = true;                                    //Go through the loop again
                }
            }
        }

        return sortedArray;                                         //
    }


}



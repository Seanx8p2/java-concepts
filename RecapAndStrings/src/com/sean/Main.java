package com.sean;

public class Main
{

    public static void main(String[] args)
    {
	    // byte, short, int, long, float, double, char, boolean, STRING

        String myString = "This is my String";
        System.out.println("My String is equal to:" + myString);

        //to change the variable
        myString = myString + " and this is more.";
        System.out.println(myString);
        System.out.println(myString + "\u00A9 2015");

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is: " + numberString);

        //how to convert int to a string (is treated purely as a text)
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

        //Strings are technically a class (but can be treated like a primitive data type with java syntax)

    }
}

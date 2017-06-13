package com.sean;

public class Main
{

    public static void main(String[] args)
    {
        // = is an assignment operator and +
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result /5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);

        //more operators...

        //++ adds 1
        result++;
        System.out.println("Result is now " + result);

        //-- subtracts 1
        result--;
        System.out.println("Result is now " + result);

        //+= adds number to result
        result+= 4;
        System.out.println("Result is now " + result);

        //+= subtracts number to result
        result-= 2;
        System.out.println("Result is now " + result);

        //*= multiplies result by number
        result*= 10;
        System.out.println("Result is now " + result);

        // /= divides result by number
        result/= 10;
        System.out.println("Result is now " + result);


        //== is a /evaluating operator!!!!

        boolean isAlien = false;
        if (isAlien ==true)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore ==100)
            System.out.println("You got the high score!!!");

        //! is an operator the is not = to
        int topScore2 = 100;
        if (topScore2 !=100)
            System.out.println("You got the high score!!!");

        // > greater than
        int topScore3 = 200;
        if (topScore3 >100)
            System.out.println("You got the high score!!!");


        //&& statement allows for a second test
        //use () for each test for cleaner formatting
        int topscore4 = 60;
        if((topScore> topscore4) && (topScore>10))
            System.out.println("Greater than top score and greater than 10");

        // || is an "or" operator
        if((topScore) >90 || (topscore4 <=90))
            System.out.println("One of these tests is true");

        //you need a boolean to tell if something is true or false!
        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");


        boolean isChar = false;
        if(isChar ==true)
            System.out.println("This is not supposed to happen");

        //? true = if true return it
        //: false otherwise return false
        isChar = false;
        boolean wasChar = isChar ? true : false;
        if(wasChar)
            System.out.println("wasChar is true");


        //list of more operators: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html



        double dubOne = 20;
        double dubTwo = 80;
        double prob = (dubOne + dubTwo)*25;
        System.out.println("20 + 80 * 25 = " + prob);

        double prob4 = prob %40;
        System.out.println("2500.0%40 = " + prob4);

        if(prob4 <=20)
            System.out.println("The result is less than or equal to 20");


        //Operator precedence: http://introcs.cs.princeton.edu/java/11precedence/

    }

}

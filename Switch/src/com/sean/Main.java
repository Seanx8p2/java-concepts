package com.sean;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        }else if(value == 2) {
//            System.out.println("Value was 2");}
//
//         else {
//            System.out.println("Value was not 1 or 2");
//
//        }

        int switchValue = 3;
        //can only test one variable. Good for testing different values for one variable
        switch(switchValue){
            //equiv to if statement is true
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");
                System.out.println("it was " + switchValue);
                break;

            //equiv to else statement

            default:
                System.out.println("Was not 1-5");
                break;
        }
        //Break jumps to here

        char letterTest = 'E';

        switch(letterTest){
            case 'A':
                System.out.println("Letter is A");
                break;

            case 'B':
                System.out.println("Letter is B");
                break;

            case 'C':
                System.out.println("Letter is C");
                break;

            case 'D':
                System.out.println("Letter is D");
                break;

            case 'E':
                System.out.println("Letter is E");
                break;

            default:
                System.out.println("Saying not found");
                break;

        }


    //Strings are case sensitive. lowercase method used to convert strings
    String month = "JANUARy";
    switch (month.toLowerCase()){
        case "january":
            System.out.println("Jan");
            break;

        case "june":
            System.out.println("Jun");
            break;

        default:
            System.out.println("Not Sure");
    }





    }
}

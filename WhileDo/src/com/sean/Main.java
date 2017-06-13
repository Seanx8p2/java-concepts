package com.sean;

public class Main {

    public static void main(String[] args)
    {
        int count = 0;
        while (count != 5)
        {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 1; i < 7; i++)
        {
            System.out.println("Count value is " + i);
        }

        count = 1;

        do
        {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100)
            {
                break;
            }
        }
        while (count != 6);

//       int number = 5;
//       int finishNumber = 20;
//       while(number <= finishNumber)
//       {
//           if(!isEvenNumber(number))
//           {
//               number++;
//               //bypasses code and continues loop
//               continue;
//           }
//           System.out.println("Even number " + number);
//           number++;

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber)
        {
            if (!isEvenNumber(number))
            {
                number++;
                //bypasses code and continues loop
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
            System.out.println("Even number " + number);
            number++;

        }
        System.out.println("Total number of even numbers found: " + evenNumbersFound);
    }


    public static boolean isEvenNumber(int i)
    {

            if (i % 2 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
}

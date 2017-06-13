package com.company;

import java.util.Scanner;

public class Main {


    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        Main m = new Main();
    }

    public Main()
    {
        Game game = new Game();


        int[][] grid = {{'x','x',' '}
                       ,{' ',' ',' '}
                       ,{' ',' ',' '}};









        try
        {
            printGrid(grid);

        }
        catch (Exception e)
        {
            System.out.println("You fucking dumbass\n\n" + e.toString());

        }
        System.exit(0);
        //calls run()
        while (game.run() && false)
        {
            /*
            //executes x/millis
            try
            {
                Thread.sleep(1000);
            }
            //otherwise error
            catch (Exception e)
            {
                System.out.println(e.toString());
            }
            */
        }


    }

    private void printGrid(int[][] grid)
    {

        System.out.printf("my number is %d my name is %s.\n\n", 69, "Evan" );

        //System.out.println("my number is " + 69 + "" my name is %s.\n\n", 69, "Evan" );

        //variable.length is dope
        // Iterate through the rows
        for(int row=0; row < grid.length; row++)
        {
            /*
            int numberFromArray = mySweetNumbers[row];
            System.out.println("mySweetNumbers[" + row + "] = " + numberFromArray);
            */
            // Print out the row
            for(int col=0; col <grid[0].length; col++)
            {
                System.out.printf("%c ", grid[row][col]);
            }
            System.out.println();
        }
    }


}

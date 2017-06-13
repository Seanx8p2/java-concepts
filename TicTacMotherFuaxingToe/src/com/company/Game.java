package com.company;

import java.util.Scanner;

/**
 * Created by Sean Whitfield on 6/6/2017.
 */

public class Game
{                   

    int[][] grid =  {{' ',' ',' '}
                    ,{' ',' ',' '}
                    ,{' ',' ',' '}};

    Scanner scanner = new Scanner(System.in);

    char currentPlayer;

//Defining variables
    private boolean running;

//Constructor
    public Game()
    {
        this.running = true;
        this.currentPlayer = 'X';
    }

    // decide which player goes first
    // get scanner
    // receive and display moves
    // if statement for has anyone won
    // Advanced graphics



  public boolean run()
  {
      System.out.println("run() has been executed");

      //waits for scanner "blocking function" nothing happens until it finishes
      String notScanner = scanner.nextLine();
      System.out.println("You wrote " + notScanner);

      return this.running;

  }

  // Gets scanner from user. returns an array where getPlayerMove[0]
  //  == x coordinate and getPlayerMove[1] == y coordinate
  private int[] getPlayerMove()
    {
        // input[1] == x coordinate
        // input[0] == y coordinate

        int[] input = new int[2];
        int rowChoice;
        int columnChoice;

        // Prompt user for x coordinate
        System.out.println("Enter Row: ");

        // put value into input[0]
        rowChoice = scanner.nextInt();
        input[1] = rowChoice;

        // prompt user for y coordinate
        System.out.println("Enter Column: ");

        // put value into input[1]
        columnChoice = scanner.nextInt();
        input[0] = columnChoice;

        System.out.printf("Row: %d \nCol: %d\n",rowChoice,columnChoice);

        return input;
    }


    private void receiveAndDisplayMoves ()
    {



        // Receive moves
        int[] move = getPlayerMove();
        int row = move[1];
        int col = move[0];

        // Check if move is valid
        if(row >0 && row <4 && col>0 && col<4)  // validate input
        {
            grid[row][col] = this.currentPlayer;
        }

        // Display Move





        char inputX = 'X';
        char inputO = 'O';





        return false;
    }





}

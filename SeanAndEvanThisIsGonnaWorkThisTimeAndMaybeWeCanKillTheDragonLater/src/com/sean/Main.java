package com.sean;

import com.sean.Weedz.Weed;
import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class Main {

	WeedFactory DankKushInc;
	Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
	    // write your code here
		Main m = new Main();
    }

    public Main()
	{
		DankKushInc = new WeedFactory("Dank Kush Inc.");



		while(420 > 69)
		{
			DankKushInc.PrintCompanyInfo();

			DankKushInc.PrintInventory();

			int selection = input.nextInt();

			if(selection == 9)
			{
				break;
			}
			else
			{
				double poundz;
				System.out.println("How many poundz u gon buy?");
				poundz = input.nextDouble();
				DankKushInc.Sale((Weed)DankKushInc.Inventory.get(selection), poundz);
			}
		}

	}

    public static boolean plzBeOdd(String thatsOdd)
    {

    	// Define string true and false
    	String True = "TRUE";
    	String False = "FALSE";

    	int stringLength = thatsOdd.length(); // Get length of string
    	thatsOdd = thatsOdd.toUpperCase();          // Ignore case
    	String words[] = thatsOdd.split(" ");     // Split sentence into words
    	int wordCount = words.length;             // Get number of words in sentence

    	for(int i=0; i<wordCount; i++)
	    {
		    switch(words[i])
		    {
			    case "NOT":
			    {
			    	// Make sure not end of array
				    if (i != wordCount - 1)
				    {
				    	// If not true, return false
					    if (words[i + 1].equals(True))
					    {
						    return false;
					    }
					    // If not false, return true
					    if (words[i + 1].equals(False))
					    {
						    return true;
					    }
				    }
			    }
			    case "TRUE":
			    {
					return true;
			    }
			    case "FALSE":
			    {
			    	return false;
			    }
		    }
	    }

		return true;
    }

}

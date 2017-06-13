package com.sean;

import java.util.ArrayList;

/**
 * Created by seanwhitfield on 6/12/17.
 */
public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();         //Array list can hold objects/Strings (different syntax)
	//They have their own class and can have a constructor
	public void addGroceryItem(String item) {
		groceryList.add(item);                                          //Adds input to the list
	}   //

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");   //returns the number of elements in the current list
		for(int i=0; i< groceryList.size(); i++) {                      //
			System.out.println((i+1) + ". " + groceryList.get(i));      //Count starts are element 1 and accesses all elements in the current list
		}
	}

	public void modifyGroceryItem(int position, String newItem) {       //Method to replace an item at a certain element postition
		groceryList.set(position, newItem);                             //Sets the String in the element position
		System.out.println("Grocery item " + (position+1) + " has been modified.");
	}

	public void removeGroceryItem(int position) {                       //Method to remove an item from a list
		String theItem = groceryList.get(position);                     //retrieves the item
		groceryList.remove(position);                                   //removes the String at this position
	}

	public String findItem(String searchItem) {							//
      // boolean exists = groceryList.contains(searchItem);				//Contains returns true if the list contains the input passed through the method

		int position = groceryList.indexOf(searchItem);					//indexOf returns the index of the first element in the specified array otherwise, it returns -1 (doesn't exist)
		if(position >=0) {
			return groceryList.get(position);							//Gets the position if it exists
		}

		return null;
	}
}


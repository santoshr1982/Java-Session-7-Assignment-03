package com.nullpointer.classes;

public class MainClass {

	public static void main(String[] args) {
		int i=15;									// Declaring variable and initialization. 
		try											//Try block begins to handle null pointer exception.
		{
				
			System.out.println("The Value of i is " + i + ".");		//Printing the value of i;
			
		}catch(NullPointerException e)					//Catching the null pointer exception.
		{
			System.out.println("The value of the pointer is pointing to null"); //Printing the error.
		}
	}
	
}

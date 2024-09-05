package Javaassginment;

import java.util.Scanner;

public class D02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Using a loop to reverse the string
	        String reversedString = "";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversedString += input.charAt(i);
	        }

	        System.out.println("Reversed string without using reverse() function: " + reversedString);
	    }
	}



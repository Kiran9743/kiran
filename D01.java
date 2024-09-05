package Javaassginment;

import java.util.Scanner;

public class D01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Using StringBuilder to reverse the string
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
		
        System.out.println("Reversed string using reverse() function: " + reversedString);
    }
}
	

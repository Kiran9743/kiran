package Javaassginment;

public class D03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int limit = 100;

	        System.out.println("Prime numbers between 1 and " + limit + ":");

	        // Loop through all numbers from 2 to 100
	        for (int i = 2; i <= limit; i++) {
	            boolean isPrime = true;

	            // Check if the number is prime or not
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            // Print the prime number
	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	

	}



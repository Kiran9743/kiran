package Javaassginment;

import java.util.ArrayList;
import java.util.Collections;

public class D06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<Integer> numbers = new ArrayList<>();
        
      
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);
        
        
        System.out.println("ArrayList before sorting: " + numbers);
        
        // Sort the ArrayList in ascending order
        Collections.sort(numbers);
        
        // Print the ArrayList after sorting
        System.out.println("ArrayList after sorting in ascending order: " + numbers);
    }
}

	

package Javaassginment;

public class D04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int[] arr = {1, 2, 3};
            int index = 5; // Accessing an index out of bounds
            int element = arr[index]; // This line will throw ArrayIndexOutOfBoundsException
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
            System.out.println("Error message: " + e.getMessage());
        }
    
	}

}

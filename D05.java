package Javaassginment;

public class D05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            String str = null;
            int length = str.length(); // This line will throw NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Exception caught: NullPointerException");
            System.out.println("Error message: " + e.getMessage());
        }
    
	}

}

package ExceptionHandling;

public class Arithmetic_Exception2 {
	public static void main(String[] args) {
		System.out.println(40*2);
		try {
		System.out.println(20/0);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage()); // using get message method to get implicit reason given by compiler	
		}
		System.out.println(10-20);
	}

}

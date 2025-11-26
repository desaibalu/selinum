package ExceptionHandling;

public class Arthimatic_Exception {
	public static void main(String[] args) {
		System.out.println(10+20);
		System.out.println(40-20);
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e) {   //specialization which is mentioned direct type of exception
			System.out.println("any number not divisible by zero");
		}
		System.out.println(10*5);
	}
	

}


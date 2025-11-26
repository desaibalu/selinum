package myfreespace;

public class methodChaining {
	/*
	 * one method calling another method is known as Method Chaining
	  Rules: when
	  ever of there are 'n' number of methods there should always be 'n-1' number
	  of calling statements or else it will results the runtime error known as
	  stack overflow error
	 */
	public static void Balu1() {
		System.out.println("calling Balu 1");
		methodChaining.Balu2();
	}

	public static void Balu2() {
		System.out.println("calling Balu 2");
		methodChaining.Balu1();
	}

	public static void main(String[] args) {
		methodChaining.Balu1();
		

	}
}

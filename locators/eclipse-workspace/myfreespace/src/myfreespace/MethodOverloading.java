package myfreespace;

public class MethodOverloading {
	/*In a class having two or more methods with same name but difference in the formal arguments is know as method overloading.
	  to achieve method overloading:
	  no. of formal argument should be different
	  if the no. of formal arguments are same then the datatypes must be different.
	  if the datatypes and no. of formal arguments are same then the position of these datatypes must be different*/

	public static void M1(double a, int b) {
		System.out.println("first method");
	}
	public static void M1(int a, double b) {
		System.out.println("second method");
	}
	public static void m2(int a,long b) {
		System.out.println("third method");
	}
	public static void m2(int a, long b,double c) {
		System.out.println("fourth method");
		
	}
	public static void main(String[] args) {
		MethodOverloading.M1(1.1, 5);
		MethodOverloading.M1(5, 1.1);
		MethodOverloading.m2(5, 1234567891);
		MethodOverloading.m2(5, 123456789,5.5);
		
		
	}
}

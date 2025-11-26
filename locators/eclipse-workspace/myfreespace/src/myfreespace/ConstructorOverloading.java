package myfreespace;

public class ConstructorOverloading {
/* Constructor overloading means in a class having two or more constructors with same name but difference in formal arguments
  the number of formal arguments are must be different
  if the number of formal arguments are same then the datatype should be different
  it the number of formal arguments and datatype are same then the positions should be different*/
	
	public void r1(int a, double b) {
		System.out.println("first method starts");
}
	public void r1(double a, int b) {
		System.out.println("second method ends");
	
	}
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		c.r1(1.5, 1);
		c.r1(5, 6.3);
	}
}
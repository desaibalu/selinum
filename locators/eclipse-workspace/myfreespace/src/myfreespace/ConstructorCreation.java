package myfreespace;
// Constructor is a special type of method where in class name is same as constructor name and constructor doesn't have any return type, it is used to call non static properties and methods in a class
public class ConstructorCreation {
	int a =10; // non static variable
	int b = 50; // non static variable
	static int c = 40; // static variable
	static int d = 20; // static variable
	
public void m1() {           // non static method
	System.out.println(a+b); 
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
}
public static void m2() {   // static method
	System.out.println("hello");
	System.out.println("bye");
	System.out.println(c+d);
	System.out.println(c*d);
	System.out.println(c-d);
}
public static void main(String[] args) {
	ConstructorCreation C = new ConstructorCreation(); // Object creation
	System.out.println(C.a); // calling non static variable
	System.out.println(C.b); // calling non static variable
	System.out.println(c);   // calling static variable
	System.out.println(d);   // calling static variable
	ConstructorCreation.m2();// calling static method
	C.m1(); // calling non static method
}
}

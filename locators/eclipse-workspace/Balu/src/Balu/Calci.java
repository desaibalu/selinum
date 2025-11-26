package Balu;

import java.util.Scanner;

public class Calci {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter your choice");
	System.out.println("enter case 1 for addition");
	System.out.println("enter case 2 for substraction");
	System.out.println("enter case 3 for multiplication");
	System.out.println("enter case 4 for division");
	int choice = s.nextInt();
	
	switch(choice) {
	case 1 : System.out.println("enter the value of a");
	int a = s.nextInt();
	 System.out.println("enter the value of b");
	int b = s.nextInt();
	System.out.println(a+b);
	break;
	
	case 2 : System.out.println("enter the value of c");
	int c = s.nextInt();
	System.out.println("enter the value of d");
	int d = s.nextInt();
	System.out.println(c-d);
	break;
	
	case 3 : System.out.println("enter the value of e");
	int e = s.nextInt();
	System.out.println("enter the value of f");
	int f = s.nextInt();
	System.out.println(e*f);
	break;
	
	case 4 : System.out.println("enter the value of g");
	int g = s.nextInt();
	System.out.println("enter the value of h");
	int h = s.nextInt();
	System.out.println(g/h);
	break;
	
	}
	
}
}

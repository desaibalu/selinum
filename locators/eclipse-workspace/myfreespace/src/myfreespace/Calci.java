package myfreespace;

import java.util.Scanner;

public class Calci {
	
	public static int add(int a, int b) {
		
		return a+b;
	}
	
public static int sub(int a, int b) {
		
		return a-b;
	}
public static int mul(int a, int b) {
	
	return a*b;
}
public static int div(int a, int b) {
	
	return a/b;
}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value a ");
		int a =s.nextInt();
		System.out.println("enter the value b ");
		int b =s.nextInt();
		
		System.out.println("enter  1 for add, enter 2 for sub, enter 3 for mul, enter 4 for div");
		System.out.println("choose one option");
		int choice = s.nextInt();
		
		
		switch(choice) {
		case 1: System.out.println(add(a,b));
		        break;
		
		case 2: System.out.println(sub(a,b));
        break;
		
		case 3: System.out.println(mul(a,b));
        break;
        
		case 4: System.out.println(div(a,b));
        break;
        
        default: System.out.println("invalid input");
		}
	}
	

}

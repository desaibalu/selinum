package myfreespace;

import java.util.Scanner;

class Demo {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
System.out.println("enter the number");
if(a%2==0) {
System.out.println("it is even number");
}
else {
	System.out.println("It is odd number");
}
}
}
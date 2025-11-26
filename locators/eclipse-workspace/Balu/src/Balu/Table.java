package Balu;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the start point");
	int sp = s.nextInt();
	
	System.out.println("enter the end point");
	int ep = s.nextInt();
	
	for(int i =sp; i<=ep; i++)
		System.out.println(i*7);
}
}

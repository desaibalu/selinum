package Balu;

import java.util.Scanner;

public class Balu1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the start point");
		int sp = s.nextInt();
		
		System.out.println("enter the end point");
		int ep = s.nextInt();
		
		for(int i=sp; i<=ep ;i++ )
				
		{ 
		  if(i%2==0) {
			  System.out.println(i);
		  }
		}		
	}
}

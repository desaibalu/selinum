package Whileloop;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("starting point");
	int sp = s.nextInt();
	System.out.println("ending point");
	int ep = s.nextInt();
	System.out.println("table number");
	int table = s.nextInt();
	int i=sp;
	while (i<=ep)
	{
		if(i%2==0)
		{System.out.println(i*table);
		}
		i++;
	}
}
}


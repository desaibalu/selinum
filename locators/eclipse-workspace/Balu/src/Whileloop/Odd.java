package Whileloop;

import java.util.Scanner;

public class Odd {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("starting point");
	int sp = s.nextInt();
	System.out.println("ending point");
	int ep = s.nextInt();
	int i=sp;
	while (i<=ep)
	{
		if(i%2==1)
		{System.out.println(i);
		}
		i++;
	}
}
}


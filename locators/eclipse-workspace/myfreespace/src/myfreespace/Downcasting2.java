package myfreespace;

public class Downcasting2 extends Downcasting1{
	
	int number = 60;
	
	public static void main(String[] args) {
		Downcasting1 d = new Downcasting2();
		System.out.println(d.num);
		
		System.out.println("------------");
		
		Downcasting2 e = new (Downcasting2)d;
		System.out.println(e.number);
	}

}

package hybrid;

public class Chicken extends Nonveg{
	String Item1 = " chicken biriyani";
	String Item2 = " chicken fry";
	String Item3 = " chicken lolipop";
	String Item4 = " chicken manchuriya";
	String Item5 = " hyderabad dum chicken biriyani";
	void Review() {
		System.out.println(" all chicken special items are available here");	
	}
	public static void main(String[] args) {
		Chicken c = new Chicken();
		System.out.println(c.Usid);
		System.out.println(c.pass);
		c.loginn();
		System.out.println("----------------------------------------------------------------");
		System.out.println(c.hotel1);
		System.out.println(c.hotel2);
		System.out.println(c.hotel3);
		System.out.println("----------------------------------------------------------------");
		System.out.println(c.Item1);
		System.out.println(c.Item2);
		System.out.println(c.Item3);
		System.out.println(c.Item4);
		c.Review();
	}
}

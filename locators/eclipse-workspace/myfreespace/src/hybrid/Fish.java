package hybrid;

public class Fish extends Nonveg {
	String Item1 = " Fish biriyani";
	String Item2 = " Fish fry";
	String Item3 = " steamed Fish ";
	String Item4 = " Fish roast";
	String Item5 = " special Fish grill";
	void Review() {
		System.out.println(" all Fish special items are available here");	
	}
	public static void main(String[] args) {
		Fish f = new Fish();
		System.out.println(f.Usid);
		System.out.println(f.pass);
		f.loginn();
		System.out.println("----------------------------------------------------------------");
		System.out.println(f.hotel1);
		System.out.println(f.hotel2);
		System.out.println(f.hotel3);
		System.out.println("----------------------------------------------------------------");
		System.out.println(f.Item1);
		System.out.println(f.Item2);
		System.out.println(f.Item3);
		System.out.println(f.Item4);
		f.Review();
	}
}

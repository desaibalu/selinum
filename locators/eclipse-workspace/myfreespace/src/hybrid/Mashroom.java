package hybrid;

public class Mashroom extends Veg{
	String Item1 = " Mashroom masala ";
	String Item2 = " Mashroom fried rice";
	String Item3 = " Mashroom roast";
	String Item4 = " Mashroom biriyani";
void review() {
	System.out.println(" Mashroom special veg items are available");
}
public static void main(String[] args) {
	Mashroom m = new Mashroom();
	System.out.println(m.Usid);
	System.out.println(m.pass);
	m.loginn();
	System.out.println("----------------------------------------------------------------");
	System.out.println(m.hotel1);
	System.out.println(m.hotel2);
	System.out.println(m.hotel3);
	System.out.println("----------------------------------------------------------------");
	System.out.println(m.Item1);
	System.out.println(m.Item2);
	System.out.println(m.Item3);
	System.out.println(m.Item4);
	m.review();
	
}

}

package hybrid;

public class Panner extends Veg{
	String Item1 = " panner masala ";
	String Item2 = " panner fried rice";
	String Item3 = " panner roast";
	String Item4 = " panner biriyani";
void review() {
	System.out.println(" panner special veg items are available");
}
public static void main(String[] args) {
	Panner p = new Panner();
	System.out.println(p.Usid);
	System.out.println(p.pass);
	p.loginn();
	System.out.println("----------------------------------------------------------------");
	System.out.println(p.hotel1);
	System.out.println(p.hotel2);
	System.out.println(p.hotel3);
	System.out.println("----------------------------------------------------------------");
	System.out.println(p.Item1);
	System.out.println(p.Item2);
	System.out.println(p.Item3);
	System.out.println(p.Item4);
	p.review();
	
}
}

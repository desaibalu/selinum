package hybrid;

public class Mutton extends Nonveg{
	String Item1 = " Mutton biriyani";
	String Item2 = " Mutton fry";
	String Item3 = " Mutton paya soup";
	String Item4 = " Mutton manchuriya";
	String Item5 = " hyderabad dum Mutton biriyani";
	void Review() {
		System.out.println(" all Mutton special items are available here");	
	}
	public static void main(String[] args) {
		Mutton M = new Mutton();
		System.out.println(M.Usid);
		System.out.println(M.pass);
		M.loginn();
		System.out.println("----------------------------------------------------------------");
		System.out.println(M.hotel1);
		System.out.println(M.hotel2);
		System.out.println(M.hotel3);
		System.out.println("----------------------------------------------------------------");
		System.out.println(M.Item1);
		System.out.println(M.Item2);
		System.out.println(M.Item3);
		System.out.println(M.Item4);
		M.Review();
	}

}

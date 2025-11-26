package myfreespace;

public class Phonepay {

public static void payment(long mobilenumber)
{
	System.out.println("PAYMENT DONE SUCCESSFULLY");
}

public static void payment(String ifsc, long accountnumber) 
{
	System.out.println("PAYMENT DONE SUCCESSFULLY");
}

public static void payment(String upid)
{
	System.out.println("PAYMENT DONE SUCCESSFULLY");
}
	
	public static void main(String[] args) {
		Phonepay.payment(1);
		Phonepay.payment("abc",56);
		Phonepay.payment("abc");

	}

}

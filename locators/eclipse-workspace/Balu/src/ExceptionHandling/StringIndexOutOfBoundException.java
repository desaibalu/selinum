package ExceptionHandling;

public class StringIndexOutOfBoundException {
public static void main(String[] args) {
	String a ="baalu";
	System.out.println(a.charAt(2));
	System.out.println(a.charAt(4));
	try {
	System.out.println(a.charAt(7));
	}
	catch(StringIndexOutOfBoundsException E) { // specialization; generalization- RuntimeException; parent Generalization -Exception
     System.out.println(E.getMessage());		
	}
	System.out.println(a.charAt(1));
}
}

package myfreespace;

public class MethodRecurration {
	// Method Recurration means method calling itself, it can be achieve in different ways
	public static void num(int i) {
		System.out.println(i);
		i++;
		if(i<=10) {
			MethodRecurration.num(i);
		}
	}
	public static void main(String[] args) {
		MethodRecurration.num(1);
	}
}

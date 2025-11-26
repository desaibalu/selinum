package practice;

public class Practice1 {
	public static void main(String[] args) {
		Practice1.num(10);
	}
		public static void num(int i) {
			if(i%2==1) {
				System.out.println(i);
			}
			i--;
			if (i>1) {
				Practice1.num(i);
			}
	}
}

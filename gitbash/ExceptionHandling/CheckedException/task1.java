package myfreespace;

public class ToUseInterruptedMethods {
	public static void main(String[] args) {
		for(int a =1; a<=10; a++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(a);
		}
		
	}

}


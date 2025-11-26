package myfreespace;

public class Insta1 extends Insta{
	@Override
	public void message() {
		System.out.println(" hello, how are you");
	}
	
    public void reels() {
    	System.out.println("watching reels for 30 min");
    }
	public static void main(String[] args) {
		
		Insta1 i =new Insta1();
		i.message();
		i.reels();
	

	}

}

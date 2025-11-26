package Nestedfor;

public class Star16B {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		for(int j=1;j<=59;j++) {
			if(j==1||j==7||j==15||j==20||j==23||j==27||j==30||j==32||j==35||j==37||j==42||j==45||j==52||j==55||j==58) {
				System.out.print("* ");
				}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}


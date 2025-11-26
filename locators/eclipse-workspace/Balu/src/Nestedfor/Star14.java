package Nestedfor;

public class Star14 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{for(int j=1;j<=7;j++)
		{
			if(i+j==9||i-j==1||i==1&&j==2||i==1&&j==3||i==2&&j==4||i==1&&j==5||i==1&&j==6)
			{
				System.out.print("* ");
			}
			else {
					System.out.print("  ");
				}
				}
		{System.out.println();
			}
		}
		
	}
}

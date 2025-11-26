package Nestedfor;

public class Star15 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{for(int j=1;j<=24;j++)
		{
			if(j==1||j==6||j==9||j==11||j==14||j==16||j==19||j==21||i==1&&j==2||i==1&&j==3||i==2&&j==4||i==1&&j==7||i==1&&j==8||i==3&&j==7||i==3&&j==2||i==3&&j==3||i==4&&j==3||i==5&&j==4||i==3&&j==8||i==3&&j==12||i==3&&j==13||i==5&&j==17||i==5&&j==18||i==5&&j==22||i==5&&j==23||i==5&&j==24)
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

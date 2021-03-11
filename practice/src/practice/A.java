package practice;

public class A {
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--)         //row
		{
			for(int j=5; j>i; j--)               //space
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)               //print or Column
			{
				
				System.out.print(k);       //  12345
			}
			System.out.println();
		}
	}

}

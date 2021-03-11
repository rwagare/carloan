package practice1;

public class Pattern4 {
	
	public static void main(String[] args) {
		int k=1;
		for(int i=1; i<=5;i++)
		{
			k=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k+5-j;
			}
			System.out.println();
		
		}
	}

}

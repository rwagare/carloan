package practice1;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number you want to check ");				
		int number = sc.nextInt();
		int fact,sum = 0;
		int n = number;
		while(n != 0)
		{	
			fact = 1;
			int r = n % 10;
			for(int i = r ; i >= 1 ; i--)
			fact = fact * i;
			sum = sum + fact;
			n=n/10;
		}
		if(sum == number)
			System.out.println(" Number is Strong Number");
		else
			System.out.println("Number is not a Strong Number");
															
	}
}

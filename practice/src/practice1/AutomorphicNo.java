package practice1;

import java.util.Scanner;

public class AutomorphicNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number u want to check:");
		int num=sc.nextInt();
		int square=num*num;
		int last=square%100;

		if(last==num)
		{
			System.out.println("Number is automarphic number");
		}
		else
		{
			System.out.println("Number is not automarphic number");
		}

		}

}

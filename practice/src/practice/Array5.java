package practice;

import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value you want to check");
		int x = sc.nextInt();
		int a[] = { 5, 7, 1, 4, 6, 10, 13 };
		for (int i = 0; i < a.length; i++) {
			int y = a[i];
			if (x == y) {
				count++;
			}

		}
		
		if(count!=0)
		{
			System.out.println("value present");
		}
		else
		{
			System.out.println("value not present");
		}

	}
}

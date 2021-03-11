package practice;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int a = sc.nextInt();
		int b[] = new int[a];
		
		System.out.println("enter elements");

		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
			sum=sum+b[i];
	}
		System.out.println("summation is");
		
			System.out.println(sum);
	
		System.out.println("average is");
		
		
			System.out.println(sum/a);
}
}
package practice;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		int sum = 0;
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int a = sc.nextInt();
		int b[] = new int[a];
	
		System.out.println("enter elements");

		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
			
		}
		
		System.out.println("original array is");
		
		for (int i = 0; i <b.length; i++) {
		
			System.out.print(b[i]+ " ");
		}
		System.out.println();
		System.out.println("reverse array is");
		
		for (int i = b.length-1; i >=0; i--) {
			
			System.out.print(b[i]+ " ");
		}
		
	}
}

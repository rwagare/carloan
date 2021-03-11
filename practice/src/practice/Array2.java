package practice;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int a = sc.nextInt();
		int b[] = new int[a];

		System.out.println("enter elements");

		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();

		}
		System.out.println("elements are:");
		for (int i = 0; i < a; i++) {
			System.out.println(b[i]);

		}
	}

}

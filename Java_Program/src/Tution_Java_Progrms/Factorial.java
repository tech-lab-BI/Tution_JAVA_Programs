package Tution_Java_Progrms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res=1;
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			res *= i;
		}
		System.out.println(n+"! is :: "+res);
	}
}
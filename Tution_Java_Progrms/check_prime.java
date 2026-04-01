package Tution_Java_Progrms;

import java.util.Scanner;

public class check_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		for(i=2;i<=n/2;i++) {
			if(n%2==0) {
				System.out.println(n+ " is not Prime.");
				break;
			}
		}
		if(i!=n/2)
			System.out.println(n+ " is Prime.");
	}

}

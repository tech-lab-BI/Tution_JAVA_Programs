package Tution_Java_Progrms;

import java.util.Scanner;

public class check_strong {

	public static int fact(int x) {
		if(x <= 1)
			return 1;
		return x*fact(x-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		int x=0,t = n;
		while(t != 0) {
			int a = t%10;
			x += fact(a);
			t /= 10;
		}
		if(x==n)
				System.out.println(n+" is Strong.");
		else
				System.out.println(n+" is not Strong.");
	}

}

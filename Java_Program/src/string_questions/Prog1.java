package string_questions;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String :: ");
		String str = sc.nextLine();
		
		int i=0, l=str.length();
		int a=0,d=0,s=0,sp=0;
		str = str.toLowerCase();
		char ch;
		while(i<l) {
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				a++;
			} else if(ch >= '0' && ch <= '9') {
				d++;
			} else if(ch == ' ') {
				s++;
			} else {
				sp++;
			}
			i++;
		}
		System.out.println("Alphabate = "+a);
		System.out.println("Digit = "+d);
		System.out.println("Space = "+s);
		System.out.println("Special char = "+sp);
		
		sc.close();
	}

}

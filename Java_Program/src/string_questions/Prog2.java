// Q33(ii) WAP to take a string as user input and toggle each word.
// input  - Hello World
// output - hELLO wORLD

package string_questions;

import java.util.Scanner;

public class Prog2 {
	
	static String reverse(String s) {
		int i=0,l=s.length()-1;
		String str="";
		while(l>=i) {
			str += s.charAt(l);
			l--;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String :: ");
		String str = sc.nextLine();
		
		String a[] = str.split(" ");
		int l = a.length;
		for(int i=0;i<l;i++){
			a[i] = reverse(a[i]);
		}
		for(int i=0;i<l;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}

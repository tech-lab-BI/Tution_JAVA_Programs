// Q34-i - WAP to take a password as user input. Check that the password is secure or not if it fulfills the below criteria:
// a) Password must contain at least 1 lowercase letter.
// b) At least 1 uppercase letter.
// c) At least 1 digit.
// d) At least 1 special character.
// e) The password must be at least length = 10.
// input  - U@code4JAVAprog
// output - Secure Password

package string_competitive_checking;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password : ");
		String s = sc.nextLine();
		boolean u=false,l=false,d=false,sp=false;
		if(s.length()>=10) {
			for(int i=s.length()-1;i>=0;i--) {
				char ch = s.charAt(i);
				if(!u && ch >= 'A' && ch<='Z') {
					u = true;
				} else if(!l && ch >= 'a' && ch<='z') {
					l = true;
				} else if(!d && ch >= '0' && ch<='9') {
					d = true;
				} else if (ch == ' ') {
					break;
				} else {
					sp = true;
				}
				if(u && l && d && sp) {
					break;
				}
			}
		}
		if(u && l && d && sp) {
			System.out.println("sequired");
		} else {
			System.out.println("Not sequired");
		}
		sc.close();
	}

}

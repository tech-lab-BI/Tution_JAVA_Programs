// Q34-iii - WAP to take a Date as user input as string. The date can be taken as "DD-MM-YYYY" or "MM-DD-YYYY". Check that the date valid or not, also print the format of input date.
// input  - 21-05-2001
// output - DD-MM-YYYY

package string_competitive_checking;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text : ");
		String s = sc.nextLine();
		StringBuffer msg = new StringBuffer("Invalid");
		if(s.length()==10) {
			String arr[] = s.split("-");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]);
			if(a>0 && b>0 && c>0) {
				if (a <= 12 && b<= 12) {
					msg.delete(0, msg.length()-1);
					msg.append("Both");
				} else if(a<=31 && b<=12) { //dd-mm-yy
					msg.delete(0, msg.length()-1);
					msg.append("DD-MM-YYYY");
				} else if(a<=12 && b<=31){
					msg.delete(0, msg.length()-1);
					msg.append("MM-DD-YYYY");
				}
			}
		}
		System.out.println(msg);
		sc.close();
	}
}

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

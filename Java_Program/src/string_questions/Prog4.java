// Q33(iv) WAP to take an array of integers as user input in string format. Find the sum of all integer values.
// input  - [2, 3, 4, 6]
// output - Sum: 15

package string_questions;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String :: ");
		String str = sc.nextLine();
		
		str = str.substring(1, str.length()-1);
		System.out.println(str);
		String a[] = str.split(",");
		int l = a.length,s=0;
		for(int i=0;i<l;i++) {
			s += Integer.parseInt(a[i]);
		}
		
		System.out.println("Sum = "+s);
		sc.close();
	}

}

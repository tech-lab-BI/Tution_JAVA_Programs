// Q36 - Write a Java program to take an array of strings as user input.
// Convert each string to its corresponding integer and find the sum of digits for all integers.
// If any string is not a valid integer, print "Invalid data". If it is null, print "null".
// input  - Array: ["123", "45", "abc"]
// output - Sum of digits: 6, 9, Invalid data

package exception_try_catch;

import java.util.Scanner;

public class String_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,s=0;
		String a[];
		while(true) {
			try {
				System.out.print("Number of String : ");
				n = sc.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("Invaild input");
			} finally {
				sc.nextLine();
			}
		}
		a = new String[n];
		System.out.println("Enter Strings : ");
		for(i=0;i<n;i++) {
			System.out.print("Index "+i+"th : ");
			a[i] = sc.nextLine();
			if(a[i].length()==0) {
				a[i] = null;
			}
		}
		for(i=0;i<n;i++) {
			try {
//				System.out.println(a[i]+" "+a[i].length());
				a[i].length();
				int x = Integer.parseInt(a[i]);
				s =0;
				while(x!=0) {
					s+=x%10;
					x/=10;
				}
				System.out.println(s);
			} catch (NullPointerException e) {
//				System.out.println(e);
				System.out.println("NULL");
			} 
			
			catch (Exception e) {
//				System.out.println(e);
				System.out.println("Invaild");
			}
		}
		sc.close();
	}

}

// Q35 - Write a Java program to take n numbers of integers using an array.
// If any input is not an integer, print "Invalid input try again" and ask for input for the same index again.
// Find the sum and average of all numbers.
// input  - Size: 3, Elements: 10, abc, 20, 30
// output - Invalid input try again, Sum: 60, Avg: 20.0

package exception_try_catch;

import java.util.Scanner;

public class Integer_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,a[],s=0;
		while(true) {
			try {
				System.out.print("Number of Element : ");
				n = sc.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("Invaild input");
			} finally {
				sc.nextLine();
			}
		}
		a = new int[n];
		System.out.println("Enter element : ");
		for(i=0;i<n;i++) {
			try {
				System.out.print("Index "+i+"th : ");
				a[i] = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Invaild input try again");
				i--;
			} finally {
				sc.nextLine();
			}
		}
		for(i=0;i<n;i++) {
			s+=a[i];
		}
		System.out.println("Sum : "+s);
		try {
			System.out.println("Avg : "+(s/n));
		} catch (Exception e) {
			System.out.println("no input");
		}
		
		sc.close();
	}

}

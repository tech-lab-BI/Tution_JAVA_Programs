// Q34-v - WAP to take a sentence as user input, reverse that sentence word wise.
// input  - Data Science is Fun
// output - Fun is Science Data

package string_competitive_checking;

import java.util.Scanner;
public class Prog5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text : ");
		String sb = sc.nextLine();
		String arr[] = sb.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			if(i!=0) {
				System.out.print(" ");
			}
		}
		sc.close();
	}

}

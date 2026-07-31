//question - Write A Java program to take an array as input. 
//Print the array elements with the sum of their digits. 
//Create the below methods in that program: 
//	void show(int a[]), int SOD(int n), void main(String args[])
//input - 22 27 33 37
//output - 22:4 27:9 33:6 37:10

package Tution_Java_Progrms;

import java.util.Scanner;

public class Main_Show_SOD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array :: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter array element :: ");
		for(int i=0;i<n;i++) 
		{
			a[i] = sc.nextInt();
		}
		show(a);
	}
	static void show(int a[]) {
		for(int x: a) {
			System.out.print(x+":"+SOD(x)+" ");
		}
	}
	static int SOD(int x) {
		int r=0;
		while(x!=0) {
			r+=x%10;
			x/=10;
		}
		return r;
	}

}

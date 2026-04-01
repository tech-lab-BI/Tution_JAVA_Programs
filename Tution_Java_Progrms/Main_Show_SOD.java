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

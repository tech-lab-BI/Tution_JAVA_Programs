package main_application;

import java.util.Scanner;

public class Main_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of element : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int min;
		for(int i=0;i<n-1;i++) {
			min = i;
			for(int j=i+1;j<n;j++) {
				if(a[min] > a[j]) {
					min = j;
				}
			}
			if(min != i) {
				int t = a[min];
				a[min] = a[i];
				a[i] = t;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

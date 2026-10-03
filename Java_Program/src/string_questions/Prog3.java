package string_questions;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String :: ");
		String str = sc.nextLine();
		
		String a[] = str.split(" ");
		int l = a.length;
//		String maxS=a[0],minS=a[0];
		int x=0,y=0;
		String maxS[] = new String[l];
		String minS[] = new String[l];
		maxS[x] = a[0];
		minS[y] = a[0];
		for(int i=1;i<l;i++){
//			if(maxS[x].length()<=a[i].length()) {
//				maxS[] = a[i];
//			}
//			if(minS.length()>a[i].length()) {
//				minS = a[i];
//			}
		}
		System.out.println("Max String :: "+maxS);
		System.out.println("Min String :: "+minS);
		sc.close();
	}

}

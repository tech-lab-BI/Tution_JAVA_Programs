package string_competitive_checking;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text : ");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		StringBuffer sb = new StringBuffer();
		
		int i=0;
		while(i<arr.length) {
			String str = arr[i].charAt(0)+"";
			sb.append(str.toUpperCase());
			sb.append(arr[i].substring(1));
			if(i!=arr.length-1)
			 sb.append(" ");
			i++;
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}

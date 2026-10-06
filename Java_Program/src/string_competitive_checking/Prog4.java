// Q34-iv - WAP to take a string consist of digit only, find the largest even and odd numbers from that string. Find the diff between them.
// input  - 128764
// output - Largest Even: 128764, Largest Odd: 1287, Diff: 127477

package string_competitive_checking;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		System.out.println("Enter Text : ");
		sb.append(sc.nextLine());
		int larE = 0;
		int larO = 0;
		int i = 0;
		System.out.println(i);
		
		while(i<sb.length()) {
			int d = Integer.parseInt(sb.substring(0, sb.length()-i));
//			System.out.println(d);
			if(d%2==0) {
				larE = Math.max(larE, d);
			} else {
				larO = Math.max(larO, d);
			}
			i++;
		}
		System.out.println(larE+" "+larO);
		System.out.println("Diff "+(larE-larO));
		
		sc.close();
	}

}

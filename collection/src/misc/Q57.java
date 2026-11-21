// Q57 - WAP to take a dataset of integers. Count the non-repeated element.
//
// Input 1: 1, 1, 2, 2, 3, 3, 4, 5, 6, 7
// Output 1: 4

package misc;
import java.util.*;

public class Q57 {

	public static void main(String[] args) {
		int rCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s[] = sc.nextLine().split(" ");
		HashSet<Integer> hs = new HashSet<Integer>();
		for(String str : s) {
			int x = Integer.parseInt(str);
			if(hs.contains(x)) {
				rCount++;
			}
			hs.add(x);
		}
		System.out.println("Count : "+(hs.size()-rCount));
	}

}

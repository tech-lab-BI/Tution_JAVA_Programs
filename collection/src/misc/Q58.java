// Q58 - WAP to take a string as user input. Find the distinct substrings from the string.
//
// Input: ababa
// Output: a, b, ab, ba, aba, bab, abab, baba, ababa

package misc;
import java.util.*;
public class Q58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s = sc.nextLine();
		int l = 1;
		HashSet<String> hs = new HashSet<String>();
		while(l <= s.length()) {
			for(int i=0;i<s.length();i++) {
				if(i < l)
					hs.add(s.substring(i,l));
			}
			l++;
		}
		for(String str : hs) {
			System.out.println(str);
		}
	}

}

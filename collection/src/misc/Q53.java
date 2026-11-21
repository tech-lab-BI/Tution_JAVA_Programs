// Q53 - Given a string as user input, repeatedly remove all adjacent duplicate character pairs until no such pairs remain.
// Return the result string or return -1 if string is empty.
//
// Input 1: AAABBAACCD
// Output 1: AD
//
// Input 2: aaaa
// Output 2: -1

package misc;
import java.util.*;

public class Q53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Character> al = new ArrayDeque<Character>();
		System.out.print("Enter string : ");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(!al.isEmpty() && al.peekLast() == s.charAt(i)) {
				al.pollLast();
			} else {
				al.offer(s.charAt(i));
			}
		}
		for(char c : al) {
			System.out.print(c);
		}
	}

}

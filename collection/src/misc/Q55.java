// Q55 - WAP to take 2 different data set, return the union of both data set. 
//Element of 2 set are not distinct, but o/p should return unique element.
//
// Input 1: a = 1, 2, 3, 2, 1   b = 3, 2, 2, 3, 3, 2
// Output 1: 1, 2, 3

package misc;
import java.util.*;

public class Q55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.print("Enter first string : ");
		String a[] = sc.nextLine().split(" ");
		System.out.print("Enter second string : ");
		String b[] = sc.nextLine().split(" ");
		for(String s : a) {
			hs.add(Integer.parseInt(s));
		}
		for(String s : b) {
			hs.add(Integer.parseInt(s));
		}
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int x : hs) {
			ts.add(x);
		}
		for(int x : ts) {
			System.out.print(x+" ");
		}
	}

}

//Q49 Take n number and remove duplicate value and print it.
package set;
import java.util.*;
public class Unique_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.print("Enter values : ");
		String s = sc.nextLine();
		for(String x : s.split(" ")) {
			hs.add(Integer.parseInt(x));
		}
		System.out.println(hs);
	}

}

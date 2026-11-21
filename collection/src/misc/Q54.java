// Q54 - WAP a program to take a list of data as user input, which represents the price of the product.
// Calculate the total profit as follows:
// For each product, find the first product to its right whose price is greater than or equal to the current product price.
// Return the total profit obtained by sum of all profit of all product.
//
// Input 1: Data: 5 4 6 2 1
// Output 1: 12
//
// Explanation 1:
// For 5 -> 6 - 5 = 1
// For 4 -> 6 - 4 = 2
// For 6 -> Profit = 6
// For 2 -> Profit = 2
// For 1 -> Profit = 1
// Total = 1 + 2 + 6 + 2 + 1 = 12

package misc;
import java.util.*;

public class Q54 {

	public static void main(String[] args) {
		int res = 0,i,j,m;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.print("Enter string : ");
		String s[] = sc.nextLine().split(" ");
		for(String str : s) {
			al.add(Integer.parseInt(str));
		}
		j = al.size();
		for(i=0;i<j;i++) {
			m = al.get(i);
			for(int k=i+1;k<j;k++) {
				if(m < al.get(k)) {
					m = al.get(k);
					break;
				}
			}
			res += (m == al.get(i)) ? m : (m-al.get(i));
		}
		System.out.println("Result : "+res);
	}

}

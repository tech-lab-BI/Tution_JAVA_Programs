// Q56 - WAP to take distinct integer as user input & integer sum. Find a pair of element
// in the data set, whose sum is equal to the inputted sum.
//
// Input 1: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// Sum = 14
// Output 1: 4, 10 | 6, 8 | 5, 9

package misc;
import java.util.*;

public class Q56 {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s[] = sc.nextLine().split(" ");
		System.out.print("Enter sum : ");
		int res = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(String str : s) {
			ts.add(Integer.parseInt(str));
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int x:ts) {
			al.add(x);
		}
		
		int i=0,j=al.size()-1;
		while(i<j) {
			int t = (al.get(i)+al.get(j));
			if(t == res) {
				System.out.println(al.get(i)+","+al.get(j));
				if(!flag) {
					flag = true;
				}
				i++;
				j--;
			} else if(t > res) {
				j--;
			} else {
				i++;
			}
		}
		if(!flag) {
			System.out.println("Not possible");
		}
	}

}

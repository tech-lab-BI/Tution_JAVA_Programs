// Q52 - WAP to find the min vertical sum of elements from the data set.
//
// Input:
// 2 3 5
// 1 2
// 1 4 5 1
//
// Vertical sums: (4) (9) (10) (1)
//
// Output:
// 1

package misc;
import java.util.*;

class Storage{
	ArrayList<Integer> al;
	Storage(String str[]){
		al = new ArrayList<Integer>();
		for(String s : str) {
			al.add(Integer.parseInt(s));
		}
	}
	void display() {
		for(int x : al) {
			System.out.println(x);
		}
	}
}

public class Q52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Line : ");
		int n = sc.nextInt();sc.nextLine();
		Storage ob[] = new Storage[n];
		System.out.println("Enter values : ");
		for(int i=0;i<n;i++) {
			String s[] = sc.nextLine().split(" ");
			ob[i] = new Storage(s);
		}
		int s = 0;
		int m = 0;
		
		for(Storage x : ob) {
			x.display();
			System.out.println("------------");
		}
//		for(int i=0;i<n;i++) {
//			s += ob[i].al.get(i);
//			if(m > s) {
//				m = s;
//			}
//		}
		System.out.print("Min : "+m);
	}

}

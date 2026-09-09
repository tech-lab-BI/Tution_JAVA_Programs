package lambda_expression_Questions;
import java.util.*;

interface Prime {
	boolean[] check(int a[]);
}

class Number {
	boolean isPrime(int x) {
		for(int j=2;j<x/2;j++) {
			if(x%j==0) {
				return false;
			}
		}
		return true;
	}
	boolean[] checkNumber(int arr[]) {
		Prime ob = (a) -> {
			boolean res[] = new boolean[a.length];
			for(int i=0;i<a.length;i++) {
				res[i] = isPrime(a[i]);
			}
			return res;
		};
	    return ob.check(arr);
	}
}

public class Main_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a[];
		
		System.out.println("Enter number : ");
		n = sc.nextInt();
		if(n==1) {
			System.out.println("Enter number : ");
		} else {
			System.out.println("Enter array : ");
		}
		a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		boolean result[] = new Number().checkNumber(a);
		System.out.println("Result : ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" -> "+result[i]);
		}
	}

}

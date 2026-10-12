package exception_try_catch;

import java.util.Scanner;

class WholeNumberException extends Exception {
	WholeNumberException(String s){
		super(s);
	}
}

class Number {
	void findAvg(int a[]) throws WholeNumberException{
		int sum=0;
		for(int x : a) {
			sum+=x;
		}
		int avg = sum/a.length;
		
		if(sum == avg*a.length) {
			System.out.println("AVG :: "+avg);
		} else {
			throw new WholeNumberException("Avg is floating number.");
		}
	}
	void findMedian(int a[]) throws WholeNumberException{
		int sum=0;
		for(int x : a) {
			sum+=x;
		}
		int med = sum/a.length;
		if(sum == med*a.length) {
			for(int x : a) {
				if(x == med) {
					System.out.println(med+" present in array.");
					return;
				}
			}
		}
		throw new WholeNumberException("Median not present");
	}
	
}

public class WholeNumber_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number array :: ");
		String s = sc.nextLine();
		String subA[] = s.split(" ");
		int num[] = new int[subA.length];
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(subA[i]);
		}
		Number n = new Number();
		try {
			n.findAvg(num);
		}
		catch(WholeNumberException e) {
			System.out.println(e.getMessage());
		}
		try {
			n.findMedian(num);
		}
		catch(WholeNumberException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}

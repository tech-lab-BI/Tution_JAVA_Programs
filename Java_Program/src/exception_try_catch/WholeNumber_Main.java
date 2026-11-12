//38. Create a Custom Exception class named WholeNumber.
//
//Create a class named Numbers having the following methods:
//
//1. findAvg(int[]) - Calculate the average of the given integer array. If the average is a floating-point number, throw the custom exception. Otherwise, print the average of all numbers.
//
//2. findMedian(int[]) - Calculate the median of all numbers. If the median value is present in the array, print the median value; otherwise, throw the custom exception.
//
//From the Main class, take an int[] as user input in the main() method and call the above methods.
//
//Input 1:
//10 11 12 13
//
//Output 1:
//Exception: avg is floating point
//Exception: median not present in array
//
//Input 2:
//2 4 6 8 10
//
//Output 2:
//Avg = 6 = median
//Median present in array

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

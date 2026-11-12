//39. Create a class named CheckValue having the following instance variable:
//
//- String s
//
//Create a parameterized constructor.
//
//Create a method named check() which will check the integer values from the given String array. If a value is not an integer, print "NOT-INT".
//
//From the Main class, take a String as user input in the main() method and check all the values.
//
//Note:
//If all values are integers, print the sum of all integers.
//
//Input:
//10 20 6F E20 79.6
//
//Output:
//10 20 NOT-INT NOT-INT NOT-INT

package exception_try_catch;

import java.util.Scanner;

class CheckValue{
	String s;
	CheckValue(String s){
		this.s = s;
	}
	int check() throws Exception{
		return Integer.parseInt(s);
	}
}

public class ArraySum_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=0,sum=0;
		
		System.out.print("Enter number array :: ");
		String s = sc.nextLine();
		String subA[] = s.split(" ");
		int num[] = new int[subA.length];
		for(int i=0;i<num.length;i++) {
			try {
				int x = new CheckValue(subA[i]).check();
				sum+=x;
				System.out.print(x+" ");
			}
			catch(Exception e) {
				System.out.print("NOT_INT ");
				flag=1;
			}
		}
		if(flag!=1) {
			System.out.println();
			System.out.println("Sum :: "+sum);
		}
		
	}

}

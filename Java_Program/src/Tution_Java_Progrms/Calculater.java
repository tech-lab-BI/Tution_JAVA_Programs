//Create a class named Calculator having main method in it.
//Take to integer value as user input through scanner class 
//and performed addition, Subtraction, Multiplication, Division.
//Print the all output in the console.

package Tution_Java_Progrms;
import java.util.Scanner;
public class Calculater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two  number :: ");
		int x=sc.nextInt();
		int y=sc.nextInt();

		System.out.println("Addition = "+(x+y));
		System.out.println("Subtraction = "+(x-y));
		System.out.println("Multiplication = "+(x*y));
		System.out.println("Division = "+((x*1.0)/y));
	}

}

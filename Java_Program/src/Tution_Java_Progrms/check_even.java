package Tution_Java_Progrms;
import java.util.Scanner;

public class check_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int n = sc.nextInt();
		if((n/2)*2==n)
			System.out.println(n+" is Even.");
		else
			System.out.println(n+" is Odd.");
	}

}

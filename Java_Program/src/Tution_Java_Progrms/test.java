package Tution_Java_Progrms;
import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		
		if(d == ((double)((int)d)))
			System.out.println("int");
		else
			System.out.println("double");
	}

}

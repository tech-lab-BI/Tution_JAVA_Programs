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

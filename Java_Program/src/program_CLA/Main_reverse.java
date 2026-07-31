//question - Write A Program to take multiple Integers 
//as Command Line Arguments. Print the numbers with their reverse.
//input - 27 23 26 90
//output - 27:72 23:32 26:62 90:9

package program_CLA;

public class Main_reverse {
	
	public static int Reverse(int x) {
		int n=0;
		while(x!=0) {
			n=(n*10)+(x%10);
			x/=10;
		}
		return n;
	}
	public static void main(String[] args) {
		int t;
		for(int i=0;i<args.length;i++) {
			t = Integer.parseInt(args[i]);
			System.out.print(t+":"+Reverse(t)+" ");
		}
	}

}

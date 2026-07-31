//question - Write A Program to take multiple Integers as 
//Command Line Arguments. Find maximum and minimum values
//between them and print it.
//input - 12 45 2 67 23
//output - Maximum: 67, Minimum: 2

package program_CLA;

public class Main_max_min {

	public static void main(String[] args) {
		int min,max,t;
		min = max = Integer.parseInt(args[0]);
		for(int i=1;i<args.length;i++) {
			t = Integer.parseInt(args[i]);
			if(min > t) {
				min = t;
			}
			if(max < t) {
				max = t;
			}
		}
		System.out.println("Max :: "+max);
		System.out.println("Min :: "+min);
	}

}

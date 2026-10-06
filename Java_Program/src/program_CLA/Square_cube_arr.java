// unknown - Write a Java program to input numbers using Command Line Arguments (CLA) and compute the square and cube of each number.
// Parse each argument as a double and use Math.pow() to calculate its square and cube.
// Display the output in the format: number->square->cube.
// input  - Command Line Arguments: 2 3 4.5
// output - 2.0->4.0->8.0
//          3.0->9.0->27.0
//          4.5->20.25->91.125

package program_CLA;

public class Square_cube_arr {
	
	public static void main(String[] args) {
		double n,sq,cu;
		for(int i=0;i<args.length;i++) {
			n = Double.parseDouble(args[i]);
			sq=Math.pow(n, 2.0);
			cu=Math.pow(n, 3.0);
			System.out.println(n+"->"+sq+"->"+cu);
		}
	}

}

// Q4 - Write a Java program to input numbers using Command Line Arguments (CLA) and compute their Mean, Standard Deviation (SD), and Variance.
// Create static methods Mean(int[]), Standard_dev(int[]), and Varience(int[]) to calculate the statistical values.
// In the main method, convert the string arguments passed via command line into an integer array, calculate the values, and display the results.
// input  - Command Line Arguments: 10 20 30 40 50
// output - Mean :: 30.0, Standard Deviation :: 14.142135623730951, Varience :: 200.0

package program_CLA;

public class Mean_sd_var {

	public static double Mean(int t[]) {
		double sum=0;
		for(int i=0;i<t.length;i++) {
			sum+=t[i];
		}
		return sum/t.length;
	}
	
	public static double Standard_dev(int t[]) {
		return Math.sqrt(Varience(t));
	}
	
	public static double Varience(int t[]) {
		double mean = Mean(t);
		double sum=0;
		for(int i=0;i<t.length;i++) {
			double d=t[i]-mean;
			sum += Math.pow(d, 2.0);
		}
		return sum/t.length;
	}
	
	public static void main(String[] args) {
		int n = args.length;
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Mean :: "+Mean(a));
		System.out.println("Standard Deviation :: "+Standard_dev(a));
		System.out.println("Varience :: "+Varience(a));
	}

}

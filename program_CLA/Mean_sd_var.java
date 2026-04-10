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

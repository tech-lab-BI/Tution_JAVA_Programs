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

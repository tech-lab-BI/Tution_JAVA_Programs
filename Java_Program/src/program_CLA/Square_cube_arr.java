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

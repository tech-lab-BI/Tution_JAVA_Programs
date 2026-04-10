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

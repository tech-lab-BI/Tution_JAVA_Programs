package number.value;

public class Factorial {
//	static int x,res=1;
//	public Factorial(int x) {
//		Factorial.x = x;
//	}
	public static int getFactorial(int x) {
		int res=1;
		for(int i=2;i<=x;i++) {
			res *= i;
		}
		return res;
	}
}
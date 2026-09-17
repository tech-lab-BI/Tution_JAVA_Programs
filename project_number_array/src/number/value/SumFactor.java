package number.value;

public class SumFactor {
//	static int x,res;
//	public SumFactor(int x) {
//		SumFactor.x = x;
//	}
	public static int getSumFactor(int x) {
		int res=0;
		int tem = x;
		while(tem != 0) {
			res+=tem%10;
			tem/=10;
		}
		return res;
	}
}

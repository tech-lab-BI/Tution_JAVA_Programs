package number.check;

import number.value.Factorial;

public class Strong {
	int x;
	public Strong(int x) {
		this.x = x;
	}
	public boolean check_Strong() {
		int a,n=0,t = x;
		while(t != 0) {
			a = t%10;
			n += Factorial.getFactorial(a);
			t /= 10;
		}
		if(x==n)
				return true;
		return false;
	}
}

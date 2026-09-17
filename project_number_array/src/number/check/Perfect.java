package number.check;

import number.value.SumFactor;

public class Perfect {
	int x;
	public Perfect(int x) {
		
	}
	public boolean check_Perfect() {
        if (x <= 1) {
            return false;
        }
        int sum = SumFactor.getSumFactor(x);
        return sum == x;
	}
}

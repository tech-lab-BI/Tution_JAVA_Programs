package number.check;

import number.value.Power;

public class Armstrong {
	int x;
	public Armstrong(int x) {
		this.x = x;
	}
	public boolean check_Armstrong() {
		int temp = x,sum=0,digits=0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = x;
        while (temp > 0) {
            int r = temp % 10;
            sum += Power.getPower(r, digits);
            temp /= 10;
        }
        return sum == x;
	}
}

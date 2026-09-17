package number.check;

public class Prime {
	int x;
	public Prime(int x) {
		this.x = x;
	}
	public boolean check_Prime() {
		for(int j=2;j<x/2;j++) {
			if(x%j==0) {
				return false;
			}
		}
		return true;
	}
}

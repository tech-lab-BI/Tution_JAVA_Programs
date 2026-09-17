package encapsulation_shape_ques;

public class Quard {
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void area() {
		if(x == y) {
			System.out.println("Square Area :: "+(Math.pow(x, 2.0)));
		}
		else {
			System.out.println("Rectanagle Area :: "+(x*y));
		}
	}
	public void perimeter() {
		System.out.println("Quard Perimeter :: "+(2*(x+y)));
	}
}

package encapsulation_shape_ques;

public class Circle {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	public void area() {
		System.out.println("Circle Area :: "+(Math.PI*Math.pow(r, 2.0)));
	}
	public void perimeter() {
		System.out.println("Circle Perimeter :: "+(2*Math.PI*r));
	}
}

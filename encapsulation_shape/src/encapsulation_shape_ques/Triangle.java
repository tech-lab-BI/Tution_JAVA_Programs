package encapsulation_shape_ques;

public class Triangle {
	private int a,b,c;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void area() {
		double sum = a+b+c;
		double max = Math.max(Math.max(a, b), c);
		if(max >= sum-max)
			System.out.print("Area can't possible for this side.");
		else {
			double s = (sum)/2.0;
			System.out.println("Triangle Area :: "+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));
		}
	}
	public void perimeter() {
		System.out.println("Circle Perimeter :: "+(a+b+c));
	}
}

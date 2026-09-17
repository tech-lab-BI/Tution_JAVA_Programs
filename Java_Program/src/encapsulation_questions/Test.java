package encapsulation_questions;

class A{
	private  String name;
	private double marks;
	private int roll;
	
	public A(String name, double marks, int roll) {
		super();
		this.name = name;
		this.marks = marks;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
}

public class Test {

	public static void main(String[] args) {
		
	}

}

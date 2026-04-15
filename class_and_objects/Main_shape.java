package class_and_objects;
import java.util.Scanner;

class Circle{
	double r;
	void areaCircle() {
		System.out.println("Circle Area :: "+(Math.PI*Math.pow(r, 2.0)));
	}
}
class Quadrilateral{
	double length, breadth;
	void areaQuadrilateral() {
		if(length == breadth) {
			System.out.println("Square Area :: "+(Math.pow(length, 2.0)));
		}
		else {
			System.out.println("Rectanagle Area :: "+(length*breadth));
		}
	}
}
class Triangle{
	double a,b,c;
	void areaTriangle() {
		double sum = a+b+c;
		double max = Math.max(Math.max(a, b), c);
		if(max >= sum-max)
			System.out.print("Area can't possible for this side.");
		else {
			double s = (sum)/2.0;
			System.out.println("Triangle Area :: "+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));
		}
	}
}
public class Main_shape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. circle\n2. quadrilateral\n3. triangle\n choose :: ");
		int ch = sc.nextInt();
		switch(ch) {
			case 1 :
				Circle o = new Circle();
				System.out.print("Enter circle redius :: ");
				o.r = sc.nextDouble();
				o.areaCircle();
				break;
			case 2 :
				Quadrilateral q = new Quadrilateral();
				System.out.print("Enter length & breadth :: ");
				q.length = sc.nextDouble();
				q.breadth = sc.nextDouble();
				q.areaQuadrilateral();
				break;
			case 3 :
				Triangle t = new Triangle();
				System.out.print("Enter three side length :: ");
				t.a = sc.nextDouble();
				t.b = sc.nextDouble();
				t.c = sc.nextDouble();
				t.areaTriangle();
				break;
			default :
				System.out.println("Wrong choice!!");
			}
	}

}

// Q - Create an abstract class named Shape having instance variables: r, h, l.
// Create constructors with 1 parameter (r), 2 parameters (r, h), and 3 parameters (r, h, l).
// Create two abstract methods: volume() and surface_area().
// Create three child classes named Sphere, Cylinder, and Cone,
// having parameterized constructors as required. Override the abstract methods in all classes.
// Create a Main class. From the main method, take user input using a menu-driven approach
// and calculate surface_area and volume.
// input  - Choice: 1, Radius: 7.0
// output - Surface Area: 615.75, Volume: 1436.76

package abstract_class;

import java.util.*;

abstract class Shape{
	double r, h, l;
	Shape(double r){
		this.r = r;
	}
	Shape(double r, double h){
		this.r = r;
		this.h = h;
	}
	Shape(double r, double h, double l){
		this.r = r;
		this.h = h;
		this.l = l;
	}
	abstract void volume();
	abstract void surface_area();
}
class Sphere extends Shape{
	Sphere(double r){
		super(r);
	}
	void volume() {
		double vol = (4.0/3) * Math.PI * Math.pow(r, 3);
		System.out.println("Volume = "+String.format("%.2f", vol));
	}
	void surface_area() {
		double area = 4 * Math.PI * Math.pow(r, 2);
		System.out.println("Surface Area = "+String.format("%.2f", area));
	}
}

class Cylinder extends Shape{
	Cylinder(double r, double h){
		super(r, h);
	}
	void volume() {
		double vol = Math.PI * Math.pow(r, 2) * h;
		System.out.println("Volume = "+String.format("%.2f", vol));
	}
	void surface_area() {
		double area = 2 * Math.PI * r * (r + h);
		System.out.println("Surface Area = "+String.format("%.2f", area));
	}
}
class Cone extends Shape{
	Cone(double r, double h, double l){
		super(r, h, l);
	}
	void volume() {
		double vol = (1.0/3) * Math.PI * Math.pow(r, 2) * h;
		System.out.println("Volume = "+String.format("%.2f", vol));
	}
	void surface_area() {
		double area = Math.PI * r * (r+l);
		System.out.println("Surface Area = "+String.format("%.2f", area));
	}
}

public class Main_Shape_abstract {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double x,y,z;
		while(true) {
			System.out.print("1. Sphere\n2. Cynlinder\n3. Cone\t4. exit\n choose :: ");
			int ch = sc.nextInt();
			System.out.println("-------------------------------------");
			switch(ch) {
				case 1 :
					System.out.print("Enter circle redius :: ");
					x = sc.nextDouble();
					Shape c = new Sphere(x);
					c.volume();
					c.surface_area();
					break;
				case 2 :
					System.out.print("Enter length & breadth :: ");
					x = sc.nextDouble();
					y = sc.nextDouble();
					Shape s = new Cylinder(x,y);
					s.volume();
					s.surface_area();
					break;
				case 3 :
					System.out.print("Enter length & breadth & height :: ");
					x = sc.nextDouble();
					y = sc.nextDouble();
					z = sc.nextDouble();
					Shape t = new Cone(x,y,z);
					t.volume();
					t.surface_area();
					break;
				case 4:
					System.exit(0);
				default :
					System.out.println("Wrong chioce");
			}
			System.out.println("-------------------------------------");
		}
	}

}

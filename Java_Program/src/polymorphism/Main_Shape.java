package polymorphism;
import java.util.*;

class Shape{
	String name;
	double peri;
	double area;
	Shape(){
		name = "No Shape";
		peri = 0;
		area = 0;
	}
	void show() {
		System.out.println("Name : "+name+" | Perimeter : "+peri+" | Area : "+area);
	}
}

class Circle extends Shape{
	double r;
	Circle(double r){//always use constructor for assignq
		this.r = r;
	}
	void show() {
		name = "Circle";
		peri = 2*Math.PI*r;
		area = Math.PI*r*r;
		System.out.println("Name : "+name+" | Perimeter : "+peri+" | Area : "+area);
	}
}
class Quard extends Shape{
	double a,b;
	Quard(double a,double b){
		this.a = a;
		this.b = b;
	}
	void show() {
		if(a == b) {
			name = "Square";
			peri = 4*a;
			area = a*a;
		}
		else {
			name = "Rectangle";
			peri = 2*(a+b);
			area = a*b;
		}
		System.out.println("Name : "+name+" | Perimeter : "+peri+" | Area : "+area);
	}
}
class Triangle extends Shape{
	double a,b,c;
	Triangle(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void show() {
		double sum = a+b+c;
		double max = Math.max(Math.max(a, b), c);
		if(max >= sum-max) {
			name = "No Triangle Formed";
			peri = 0;
			area = 0;
		}
		else {
			double s = (sum)/2.0;
			name = "Triangle";
			peri = sum;
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		System.out.println("Name : "+name+" | Perimeter : "+peri+" | Area : "+area);
	}
}

public class Main_Shape {

	public static void main(String[] args) {
		int ch;
		double a,b,c;
		Shape s = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Circle\n2. Quard\n3. Triangle\n4. No Shape\n5. Exit");
			System.out.println("--------------------------------");
			System.out.print("Enter chioce ::: ");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Ente redius : ");
					a = sc.nextDouble();
					s = new Circle(a);
					s.show();
					break;
				case 2:
					System.out.print("Ente width : ");
					a = sc.nextDouble();
					System.out.print("Ente height : ");
					b = sc.nextDouble();
					s = new Quard(a, b);
					s.show();
					break;
				case 3:
					System.out.print("Ente width : ");
					a = sc.nextDouble();
					System.out.print("Ente height : ");
					b = sc.nextDouble();
					System.out.print("Ente breadth : ");
					c = sc.nextDouble();
					s = new Triangle(a,b,c);
					s.show();
					break;
				case 4:
					s = new Shape();
					s.show();
					break;
				case 5:
					System.exit(0);
				default :
					System.out.println("wrong chioce~!");
			}
			System.out.println("--------------------------------");
		}
		
	}

}

package inner_class_Questions;

import java.util.*;

class Shape{
	double c_area=0,q_area=0,t_area=0;
	void display() {
		if(c_area != 0) {
			System.out.println("Circle Area : "+String.format("%.2f", c_area));
		} else if(q_area != 0) {
			System.out.println("Quard Area : "+String.format("%.2f", q_area));
		} else if(t_area != 0){
			System.out.println("Triangle Area : "+String.format("%.2f", t_area));
		} else {
			System.out.println("Area not possible..");
		}
	}
	class Circle {
		double r;
		Circle(double r){
			this.r = r;
		}
		void area() {
			c_area = Math.PI * r * r;
		}
	}
	class Quard {
		double a,b;
		Quard(double a, double b){
			this.a = a;
			this.b = b;
		}
		void area() {
			if(a == b) {
				q_area = a * a;//square
			} else {
				q_area = a * b;//rectangle
			}
		}
	}
	class Triangle {
		double a,b,c;
		Triangle(double a, double b,double c){
			this.a = a;
			this.b = b;
			this.c = c;
		}
		void area() {
			double s = a+b+c;
			double m = Math.max(a, Math.max(b, c));
			if((s-m) >= m) {
				s /= 2.0;
				t_area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
			} else {
				System.out.println("This trianlge not possible.");
			}
		}
	}
}

public class Shape_Main_Member_Inner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y,z;
		Shape s = new Shape();
		
//		while(true) {
			System.out.print("1. circle\n2. quadrilateral\n3. triangle\n choose :: ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1 :
					System.out.print("Enter circle redius :: ");
					x = sc.nextDouble();
					Shape.Circle scir = s.new Circle(x);
					scir.area();
					break;
				case 2 :
					System.out.print("Enter length & breadth :: ");
					x = sc.nextDouble();
					y = sc.nextDouble();
					Shape.Quard squd = s.new Quard(x, y);
					squd.area();
					break;
				case 3 :
					System.out.print("Enter length & breadth & height :: ");
					x = sc.nextDouble();
					y = sc.nextDouble();
					z = sc.nextDouble();
					Shape.Triangle stri = s.new Triangle(x, y, z);
					stri.area();
					break;
				default :
					System.out.println("Wrong chioce");
			}
			s.display();
//		}
	}

}

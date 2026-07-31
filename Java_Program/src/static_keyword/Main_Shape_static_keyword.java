package static_keyword;
import java.util.*;

class Shape{
	static double a,b,c,area,peri;
	static String shapeName;
	Shape(){
		shapeName = "no input";
		area = 0;
		peri = 0;
	}
	Shape(double n1){
		a = n1;
	}
	Shape(double n1,double n2){
		this(n1);
		b = n2;
	}
	Shape(double n1,double n2,double n3){
		this(n1, n2);
		c = n3;
	}
	static class Circle{
		Circle(){
			shapeName = "Circle";
		}
		void calculate() {
			area = Math.PI*a*a;
			peri = 2*Math.PI*a;
		}
	}
	static class Quard{
		Quard(){
			if(a == b)
				shapeName = "Square";
			else
				shapeName = "Rectangle";
		}
		void calculate() {
			area = a*b;
			peri = 2*a + 2*b;
		}
	}
	static class Triangle{
		Triangle(){
			shapeName = "Triangle";
		}
		void calculate() {
			double sum = a+b+c;
			double max = Math.max(Math.max(a, b), c);
			if(max >= sum-max) {
				area = -1;
			}
			else {
				double s = (sum)/2.0;
				area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			}
			peri = a+b+c;
		}
	}
	void show() {
		System.out.println("Shape name = "+shapeName);
		if(area == -1)
			System.out.println("Area not possible");
		else
		System.out.println("Area = "+area);
		System.out.println("Perimeter = "+peri);
	}
}

public class Main_Shape_static_keyword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x,y,z;
		while(true) {
			System.out.print("1. circle\n2. quadrilateral\n3. triangle\t4. exit\n choose :: ");
			int ch = sc.nextInt();
			System.out.println("-------------------------------------");
			switch(ch) {
				case 1 :
					System.out.print("Enter circle redius :: ");
					x = sc.nextDouble();
					Shape c = new Shape(x);
					Shape.Circle c1 = new Shape.Circle();
					c1.calculate();
					c.show();
					break;
				case 2 :
					System.out.print("Enter length & breadth :: ");
					x = sc.nextDouble();
					y = sc.nextDouble();
					Shape s = new Shape(x,y);
					Shape.Quard s1 = new Shape.Quard();
					s1.calculate();
					s.show();
					break;
				case 3 :
					System.out.print("Enter length & breadth & height :: ");
					x = sc.nextDouble();
					y = sc.nextDouble();
					z = sc.nextDouble();
					Shape t = new Shape(x,y,z);
					Shape.Triangle t1 = new Shape.Triangle();
					t1.calculate();
					t.show();
					break;
				case 4:
					System.exit(0);
				default :
					Shape n = new Shape();
					n.show();
			}
			System.out.println("-------------------------------------");
		}
	}

}

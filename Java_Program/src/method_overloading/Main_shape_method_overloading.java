//question - Create a class Shape having instance variables area and perimeter. 
//Create method overloading with the name display() to calculate having no parameter, 
//1 parameter, 2 parameters, 3 parameters. No parameters — display no shape. 
//1 parameter — display area & perimeter of circle. 
//2 parameters — display area & perimeter of square or rectangle. 
//3 parameters — display area & perimeter of triangle. 
//Create Main class and from main() take the inputs by menu driven approach and 
//class the required method to display.
//input - 1 5.0
//output - Area of Circle: 78.53981633974483, Perimeter of Circle: 31.41592653589793

package method_overloading;
import java.util.Scanner;

class Shape{
	void calculate() {
		System.out.println("No Shape");
	}
	void calculate(double r) {
		System.out.println("Circle Area :: "+(Math.PI*Math.pow(r, 2.0)));
		System.out.println("Circle Perimeter :: "+(2*Math.PI*r));
	}
	void calculate(double length, double breadth) {
		if(length == breadth) {
			System.out.println("Square Area :: "+(Math.pow(length, 2.0)));
			System.out.println("Square Perimeter :: "+(2*(length+breadth)));
		}
		else {
			System.out.println("Rectanagle Area :: "+(length*breadth));
			System.out.println("Rectanagle Perimeter :: "+(2*(length*breadth)));
		}
	}
	void calculate(double a, double b, double c) {
		double sum = a+b+c;
		double max = Math.max(Math.max(a, b), c);
		if(max >= sum-max)
			System.out.println("Area can't possible for this side.");
		else {
			double s = (sum)/2.0;
			System.out.println("Triangle Area :: "+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));
		}
		System.out.println("Triangle Perimeter :: "+(a+b+c));
	}
}

public class Main_shape_method_overloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s;
		double a,b,c;
		while(true) {
			System.out.print("How many number of parameter (4-exit) :: ");
			int ch = sc.nextInt();
			switch(ch) {
				case 0 :
					s = new Shape();
					s.calculate();
					break;
				case 1:
					System.out.print("Enter redius :: ");
					a = sc.nextDouble();
					s = new Shape();
					s.calculate(a);
					break;
				case 2 :
					System.out.print("Enter length & breadth :: ");
					a = sc.nextDouble();
					b = sc.nextDouble();
					s = new Shape();
					s.calculate(a, b);
					break;
				case 3 :
					System.out.print("Enter length, breadth & height :: ");
					a = sc.nextDouble();
					b = sc.nextDouble();
					c = sc.nextDouble();
					s = new Shape();
					s.calculate(a, b, c);
					break;
				case 4:
					System.exit(0);
				default :
					System.out.println("Wrong choice!! try again");
			}
			System.out.println("------------------------------------------------");
		}
	}

}

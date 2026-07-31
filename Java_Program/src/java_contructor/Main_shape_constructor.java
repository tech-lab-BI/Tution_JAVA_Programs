//question - Create a class named Shape having instance variables a, b, c. 
//Define constructor overloading in that class having no parameters which print "No shape", 
//having one parameter which print the area of circle, having two parameters which print the
//area of rectangle or square, having three parameters which will print the area of triangle. 
//From Main class and from main() take input values of different kind of shape with menu driven
//approach and call appropriate constructors to print the output.
//input - 2 5 6
//output - Area of Rectangle/Square: 30.0

package java_contructor;
import java.util.*;

class Shape{
	double a,b,c;
	Shape(){
		System.out.println("No Shape !!"); 
	}
	Shape(double r){
		a=r;
		System.out.println("Area of circle :: "+(Math.PI*r*r));
	}
	Shape(double x,double y){
		a=x;b=y;
		if(a==b)
			System.out.println("Area of square :: "+(a*a));
		else
			System.out.println("Area of rectangle :: "+(a*b));
	}
	Shape(double x,double y,double z){
		a=x;b=y;c=z;
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

public class Main_shape_constructor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y,z;
		while(true) {
			System.out.print("1. circle\n2. quadrilateral\n3. triangle\t4. exit\n choose :: ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1 :
					System.out.print("Enter circle redius :: ");
					Shape c = new Shape(sc.nextDouble());
					break;
				case 2 :
					System.out.print("Enter length & breadth :: ");
					x = sc.nextDouble();
					y = sc.nextDouble();
					Shape s = new Shape(x,y);
					break;
				case 3 :
					System.out.print("Enter length & breadth & height :: ");
					x = sc.nextDouble();
					y = sc.nextDouble();
					z = sc.nextDouble();
					Shape t = new Shape(x,y,z);
					break;
				case 4:
					System.exit(0);
				default :
					Shape n = new Shape();
			}
		}
	}

}

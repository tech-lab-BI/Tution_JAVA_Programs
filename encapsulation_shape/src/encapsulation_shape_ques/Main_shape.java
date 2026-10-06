// Q - 31) Create a package named shape having 3 classes named Circle, Quad, and Triangle.
// Circle has 1 instance variable (r), Quad has 2 instance variables (a, b), and Triangle has 3 instance variables (a, b, c).
// All 3 classes should be encapsulated.
// Create methods area() and perimeter() in all the above 3 classes.
// Create a package main having Main class with main() method. Take input of different types of shape, find area, perimeter, and class of shape.
// input  - Choice: 1 (Circle), Radius: 7
// output - Shape: Circle, Area: 153.938, Perimeter: 43.982

package encapsulation_shape_ques;

import java.util.Scanner;

public class Main_shape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("1. circle\n2. quadrilateral\n3. triangle\n choose :: ");
		int ch = sc.nextInt();
		switch(ch) {
			case 1 :
				Circle o = new Circle();
				System.out.print("Enter circle redius :: ");
				a = sc.nextInt();
				o.setR(a);
				System.out.println("Circle redius :: "+o.getR());
				o.area();
				o.perimeter();
				break;
			case 2 :
				Quard q = new Quard();
				System.out.print("Enter length & breadth :: ");
				a = sc.nextInt();
				b = sc.nextInt();
				q.setX(a);
				q.setY(b);
				System.out.println("Quard length :: "+q.getX()+" breadth :: "+q.getY());
				q.area();
				q.perimeter();
				break;
			case 3 :
				Triangle t = new Triangle();
				System.out.print("Enter three side length :: ");
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				t.setA(a);
				t.setB(b);
				t.setC(c);
				System.out.println("Triangle length :: "+t.getA()+" breadth :: "+t.getB()+" height :: "+t.getC());
				t.area();
				t.perimeter();
				break;
			default :
				System.out.println("Wrong choice!!");
		}
		sc.close();
	}

}

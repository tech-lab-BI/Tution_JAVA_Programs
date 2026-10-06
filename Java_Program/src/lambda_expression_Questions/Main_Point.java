// Q29 - Create a class named Point having 2 instance variables: x, y. Create parameterized constructors as required. This class denotes the 2D-coordinate point.
// Create a functional interface named Distance having abstract method: void distance(Point p1, Point p2).
// Create another class named Calculate2D having instance variables: Point p1, p2. Create parameterized constructors as required.
// Create another method find(), which will implement the functional interface method using lambda expression.
// It will first print the coordinate details of the two points and find the distance between two points.
// Create Main class and from main(), take 2 Points as user input and call find().
// input  - Point 1: 0 0, Point 2: 3 4
// output - Point 1: (0, 0), Point 2: (3, 4), Distance: 5.0

package lambda_expression_Questions;

import java.util.Scanner;

class Point{
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

interface Distance{
	double distance(Point p1, Point p2);
}

class Calculate2D{
	static void quard(int x, int y) {
		if(x == 0 && y == 0) {
			System.out.println("center");
		} else if(x > 0 && y > 0) {
			System.out.println("1st quard");
		} else if(x > 0 && y < 0) {
			System.out.println("4th quard");
		} else if(x < 0 && y > 0) {
			System.out.println("2nd quard");
		} else {
			System.out.println("3rd quard");
		}
	}
	void find(Point p1, Point p2) {
		System.out.print("p1 - ");
		quard(p1.x, p1.y);
		System.out.print("p2 - ");
		quard(p2.x, p2.y);
		Distance d = (Point po1, Point po2) -> {
			double res = Math.sqrt(Math.pow((po2.x-po1.x),2)+Math.pow((po2.y-po1.y), 2));
			return res;
		};
		System.out.print("dis =  "+d.distance(p1, p2));
	}
}

public class Main_Point {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		System.out.print("Enter first point : ");
		x = sc.nextInt();
		y = sc.nextInt();
		Point p1 = new Point(x, y);
		System.out.print("Enter second point : ");
		x = sc.nextInt();
		y = sc.nextInt();
		Point p2 = new Point(x, y);
		
		new Calculate2D().find(p1, p2);
		sc.close();
	}

}

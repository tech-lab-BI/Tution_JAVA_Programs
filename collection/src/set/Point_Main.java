// Q50 - Create a class named Point having instance variables x and y.
// Create a parameterized constructor and override toString().
// Create Main class with main() method.
// Take n number of points as user input, remove duplicate points, and print unique points.
//
// Input:
// x   y
// 2   4
// 1   2
//
// Output:
// x = 1 y = 2
// x = 2 y = 4
package set;
import java.util.*;
class Point implements Comparable<Point>{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return ("x="+x+","+"y="+y);
	}
	public int compareTo(Point p) {
		if(this.x > p.x)
			return 1;
		else if(this.x < p.x)
			return -1;
		else {
			if(this.y > p.y)
				return 1;
			else if(this.y < p.y)
				return -1;
			else
				return 0;
		}
	}
}
public class Point_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		String s,str[];
		HashSet<Point> p = new HashSet<Point>();
		System.out.print("how many vaoues : ");
		int n = sc.nextInt();
		System.out.println("Enter x :: y values --");
		for(int i=0;i<n;i++){
			x = sc.nextInt();
			y = sc.nextInt();
			p.add(new Point(x,y));
		};
		for(Point t : p) {
			System.out.println(t);
		}
	}

}

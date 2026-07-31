//question - Create a class named Point having instance variables x, y. 
//Use constructor overloading with no parameter which will assign the point as (0, 0), 
//having one parameter which will assign value as (x, 0), and having two parameters 
//which will assign value as (x, y). Create a class Calculate having instance variable with two 
//Point class objects using aggregation. Use constructor overloading having no parameters 
//which will print "no point", having one parameter which will print the distance from center, 
//and having two parameters which will print the distance between two points. 
//From Main class and from main() take two points as user input in any quadrant as per 
//user choice using menu driven approach and calculate the distance between two points through the Calculate class.
//input - 2 3 4 5 6
//output - Distance between two points: 2.8284271247461903

package java_contructor;
import java.util.Scanner;

class Point{
	int x,y;
	Point(){			//point 0
		x=0;y=0;
	}
	Point(int a){		//point 1
		x=a;y=0;
	}
	Point(int a,int b){ //point 2
		x=a;y=b;
	}
	String show() {
		return "("+x+","+y+")";
	}
}
class Calculate{
	Point p1,p2;
	Calculate(){						//calculate 0
		System.out.println("No Point selected !!");
	}
	Calculate(Point a){					//calculate 1
		p1 = a;
		double dis = Math.sqrt((Math.pow((p1.x), 2))+(Math.pow((p1.y), 2)));
		System.out.println("Distance from center : "+dis);
	}
	Calculate(Point a,Point b){			//calculate 2
		p1 = a;p2 = b;
		double dis = Math.sqrt((Math.pow((p2.x-p1.x), 2))+(Math.pow((p2.y-p1.y), 2)));
		System.out.println("Distance between "+p1.show()+" & "+p2.show()+" : "+dis);
	}
}
public class Main_point {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch1,ch2, x,y;
		
		System.out.println("------CALCULATE DISTANCE-----");
		System.out.print("1) From center, 2) Two point\nChioce :: ");
		ch1 = sc.nextInt();
		switch(ch1) {
			case 1:
				System.out.print("point have 1. single parameter / 2. Two parameter\nchioce : ");
				ch2 = sc.nextInt();
				switch(ch2) {
					case 1:
						System.out.print("Enter x = ");
						x = sc.nextInt();
						Point p11 = new Point(x);			//point 1
						Calculate c11 = new Calculate(p11);	//calculate 1
						break;
					case 2:
						System.out.print("Enter 1st x & y value = ");
						x = sc.nextInt();
						y = sc.nextInt();
						Point p12 = new Point(x,y);			//point 2
						Calculate c12 = new Calculate(p12);	//calculate 1
						break;
					default:
						Point p0 = new Point();				//point 0
						Calculate c0 = new Calculate();		//calculate 0
				}
				break;
			case 2:
				Point p21,p22;
				System.out.print("1st point have 1. single parameter / 2. Two parameter\nchioce : ");
				ch2 = sc.nextInt();
				switch(ch2) {
					case 1:
						System.out.print("Enter x = ");
						x = sc.nextInt();
						p21 = new Point(x);
						break;
					case 2:
						System.out.print("Enter 1st x & y value = ");
						x = sc.nextInt();
						y = sc.nextInt();
						p21 = new Point(x,y);
						break;
					default:
						p21 = new Point();
						Calculate c0 = new Calculate();
				}
				System.out.print("2nd point have 1. single parameter / 2. Two parameter\nchioce : ");
				ch2 = sc.nextInt();
				switch(ch2) {
					case 1:
						System.out.print("Enter x = ");
						x = sc.nextInt();
						p22 = new Point(x);
						break;
					case 2:
						System.out.print("Enter 2nd x & y value = ");
						x = sc.nextInt();
						y = sc.nextInt();
						p22 = new Point(x,y);
						break;
					default:
						p22 = new Point();
						Calculate c0 = new Calculate();
				}
				Calculate c2 = new Calculate(p21,p22);
				break;
			default:
				System.out.println("Wrong choice !!");
		}
		System.out.println("-----------program end-------------");
	}
}

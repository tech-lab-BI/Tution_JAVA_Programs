package interface_Questions;

import java.util.Scanner;

interface Area {
	void getArea();
}
interface Volume {
	void getVolume();
}

class Sphere implements Area, Volume {
	double r;
	double a,v;
	Sphere(double r){
		this.r = r;
	}
	public void getArea() {
		a = 4*Math.PI*r*r;
	}
	public void getVolume() {
		v = (4.0/3)*Math.PI*r*r*r;
	}
	void show() {
		System.out.println("Circle Area = "+a+" , "+"Volume = "+v);
	}
}

class Cylinder implements Area, Volume {
	double r,h;
	double a,v;
	Cylinder(double r, double h){
		this.r = r;
		this.h = h;
	}
	public void getArea() {
		a = (2*Math.PI*r*h + 2*Math.PI*r*r);
	}
	public void getVolume() {
		v = Math.PI*r*r*h;
	}
	void show() {
		System.out.println("Cylinder Area = "+a+" , "+"Volume = "+v);
	}
}

class Cone implements Area, Volume {
	double r,h;
	double a,v;
	Cone(double r,double h){
		this.r = r;
		this.h = h;
	}
	public void getArea() {
		a = (Math.PI*r*r + Math.PI*r*Math.sqrt((r*r + h*h)));
	}
	public void getVolume() {
		v = Math.PI*r*r*(h/3.0);
	}
	void show() {
		System.out.println("Cone Area = "+a+" , "+"Volume = "+v);
	}
}

public class Area_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r,h;
		
		System.out.print("1. Sphere\n2. Cynlinder\n3. Cone\n choose :: ");
		int ch = sc.nextInt();
		switch(ch) {
			case 1 :
				System.out.print("Enter circle redius :: ");
				r = sc.nextDouble();
				Sphere ob1 = new Sphere(r);
				ob1.getArea();
				ob1.getVolume();
				ob1.show();
				break;
			case 2 :
				System.out.print("Enter length & breadth :: ");
				r = sc.nextDouble();
				h = sc.nextDouble();
				Cylinder ob2 = new Cylinder(r,h);
				ob2.getArea();
				ob2.getVolume();
				ob2.show();
				break;
			case 3 :
				System.out.print("Enter length & breadth & height :: ");
				r = sc.nextDouble();
				h = sc.nextDouble();
				Cone ob3 = new Cone(r,h);
				ob3.getArea();
				ob3.getVolume();
				ob3.show();
				break;
			case 4:
				System.exit(0);
			default :
				
		}
	}

}

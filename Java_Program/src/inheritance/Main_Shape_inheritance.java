//question - Create a class named Shape having instance variables name,
//vol and a method showVol(), which will display the volume in console. 
//Create a child class of Shape named Sphere having instance variable rad. 
//Create a method named calculate_sphere(), which will calculate the sphere volume and 
//store in name and volume variable in shape class. In the above same way, 
//create two child class of shape named Cylinder and Cone. 
//Cylinder is having instance variables rad, height. Cone is having instance variables rad, height.
//Both classes will have the method named calculate_Cylinder(), calculate_Cone() respectively.
//All 3 child classes have parameterized constructor as required. Create Main class and from main()
//take input of 3 type of shapes using menu driven approach and show their value.
//input - 1 5.0
//output - Name: Sphere, Volume: 523.5987755982989

package inheritance;
import java.util.Scanner;

class Shape{
	String name;
	double vol;
	void showVol() {
		System.out.println("Volume of "+name+" : "+vol);
	}
}

class Sphere extends Shape{
	double rad;
	Sphere(double rad){
		this.rad = rad;
	}
	void calSphere() {
		name = "Sphere";
		vol = ((4.0/3)*Math.PI*Math.pow(rad, 3.0));
	}
}
class Cylinder extends Shape{
	double rad;
	double height;
	Cylinder(double rad, double height){
		this.rad = rad;
		this.height = height;
	}
	void calCylinder() {
		name = "Cylinder";
		vol = (Math.PI*Math.pow(rad, 2.0)*height);
	}
}
class Cone extends Shape{
	double rad;
	double height;
	Cone(double rad, double height){
		this.rad = rad;
		this.height = height;
	}
	void calCone() {
		name = "Cone";
		vol = ((1.0/3)*Math.PI*Math.pow(rad, 2.0)*height);
	}
}

public class Main_Shape_inheritance {

	public static void main(String[] args) {
		int ch;
		double r,h;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Sphere\n2. Cylinder\n3. Cone\n4. Exit");
			System.out.println("--------------------------------");
			System.out.print("Enter chioce ::: ");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Ente redius : ");
					r = sc.nextDouble();
					Sphere s = new Sphere(r);
					s.calSphere();
					s.showVol();
					break;
				case 2:
					System.out.print("Ente redius : ");
					r = sc.nextDouble();
					System.out.print("Ente height : ");
					h = sc.nextDouble();
					Cylinder cy = new Cylinder(r, h);
					cy.calCylinder();
					cy.showVol();
					break;
				case 3:
					System.out.print("Ente redius : ");
					r = sc.nextDouble();
					System.out.print("Ente height : ");
					h = sc.nextDouble();
					Cone co = new Cone(r, h);
					co.calCone();
					co.showVol();
					break;
				case 4:
					System.exit(0);
				default :
					System.out.println("wrong chioce~!");
			}
			System.out.println("--------------------------------");
		}
		
	}

}

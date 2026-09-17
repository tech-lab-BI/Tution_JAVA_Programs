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

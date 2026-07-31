//question - Create a class named Address having instance variable area, dist, state and PIN. 
//Create a method display(), which will display the area details. 
//Create a class named Student having instance variables name, roll and use aggregation of address class. 
//Create a method named show() which will print all details of a student including address. 
//Create Main class and from main method take student details. 
//Take user input through Scanner class and call show() to display the details.
//input - Amit 101 MG_Road Kolkata WB 700001
//output - Name: Amit, Roll: 101, Address: MG_Road, Kolkata, WB, 700001

package program_Aggregation;
import java.util.Scanner;

class Address{
	String area;
	String dist;
	String state;
	int pin;
	void display() {
		System.out.println("Area :: "+area);
		System.out.println("Dist :: "+dist);
		System.out.println("State :: "+state);
		System.out.println("PIN :: "+pin);
	}
}
class Student{
	String name;
	int roll;
	Address add;
	void show() {
		System.out.println("Student Details :: ");
		System.out.println("Name :: "+name); 
		System.out.println("Roll :: "+roll);
		add.display();
	}
}
public class Main_student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Address ad = new Address();
		Student st = new Student();
		System.out.println("Enter Student details :: ");
		System.out.print("Name : ");
		st.name = sc.nextLine();
		System.out.print("Roll : ");
		st.roll = sc.nextInt();
		sc.nextLine();
		System.out.print("Area : ");
		ad.area = sc.nextLine();
		System.out.print("Dist : ");
		ad.dist = sc.nextLine();
		System.out.print("State : ");
		ad.state = sc.nextLine();
		System.out.print("PIN : ");
		ad.pin = sc.nextInt();
		st.add = ad;
		
		st.show();
	}

}

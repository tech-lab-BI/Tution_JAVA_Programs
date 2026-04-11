package class_and_objects;
import java.util.Scanner;

class Student{
	String name;
	int roll;
	double marks;
	void show() {
		System.out.println("Students details with highest marks -");
		System.out.println("Name :: "+name);
		System.out.println("Roll :: "+roll);
		System.out.println("Marks :: "+marks);
	}
}
public class Main_student_details {

	static Student higestMarkFind(Student n1, Student n2) {
		if(n1.marks > n2.marks) {
			return n1;
		}
		return n2;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println("Enter 1st student details - ");
		System.out.print("Name :: ");
		s1.name = sc.nextLine();
		System.out.print("Roll :: ");
		s1.roll = sc.nextInt();
		System.out.print("Marks :: ");
		s1.marks = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter 2nd student details - ");
		System.out.print("Name :: ");
		s2.name = sc.nextLine();
		System.out.print("Roll :: ");
		s2.roll = sc.nextInt();
		System.out.print("Marks :: ");
		s2.marks = sc.nextDouble();
		
		Student t = higestMarkFind(s1, s2);
		t.show();
		sc.close();
	}

}

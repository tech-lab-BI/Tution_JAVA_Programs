package java_contructor;
import java.util.Scanner;

class Student{
	String name;
	short roll;
	double mark;
	Student(String t_name, short t_roll, double t_mark){
		name = t_name;
		roll = t_roll;
		mark = t_mark;
	}
	void show() {
		System.out.println("Name :: "+name+" | Roll :: "+roll+" | Mark ::"+mark);
	}
}

public class Main_student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		short roll;
		double mark;
		
		System.out.println("--------------1st student details----------------------");
		System.out.print("Enter student name -> ");
		name = sc.nextLine();
		System.out.print("Enter student roll -> ");
		roll = sc.nextShort();
		System.out.print("Enter student mark -> ");
		mark = sc.nextDouble();
		sc.nextLine();
		Student s1 = new Student(name, roll, mark);
		
		System.out.println("--------------2nd student details----------------------");
		System.out.print("Enter student name -> ");
		name = sc.nextLine();
		System.out.print("Enter student roll -> ");
		roll = sc.nextShort();
		System.out.print("Enter student mark -> ");
		mark = sc.nextDouble();
		sc.nextLine();
		Student s2 = new Student(name, roll, mark);
		
		System.out.println("----------------Checking output------------------");
		s1.show();
		s2.show();
		System.out.println("---------------Student with highest mark-------------------");
		if(s1.mark > s2.mark)
			s1.show();
		else
			s2.show();
	}

}

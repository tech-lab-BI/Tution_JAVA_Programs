//WAP to create a class Student having instance variables — name, roll, marks. 
//Create a parameterized constructor and a method named void studentDetails(), 
//which will print the details of the student.

package priorityQueue;
import java.util.*;

class Student{
	String name;
	int roll;
	int marks;
	Student(String name,int roll,int marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	void studentDetails() {
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("Marks : "+marks);
	}
}

class MyComp1 implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		if(o1.marks < o2.marks)
			return 1;
		else if(o1.marks > o2.marks)
			return -1;
		else {
			if(o1.roll > o2.roll)
				return 1;
			else if(o1.roll < o2.roll)
				return -1;
			else
				return 0;
		}
	}
}

public class Student_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int roll,marks;
		PriorityQueue<Student> p = new PriorityQueue<Student>(new MyComp1());
		System.out.print("Number student : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+"th student ----");
			sc.nextLine();
			System.out.print("Name : ");
			name = sc.nextLine();
			System.out.print("Roll : ");
			roll = sc.nextInt();
			System.out.print("Mark : ");
			marks = sc.nextInt();
			p.add(new Student(name, roll, marks));
		}
		System.out.println("Deleted Student ---------");
		p.poll().studentDetails();
	}

}

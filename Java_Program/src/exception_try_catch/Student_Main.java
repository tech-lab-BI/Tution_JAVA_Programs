//40. Create a class named Student having the following instance variables:
//
//- roll
//- name
//- mark
//
//Create a method display() which will print all the details of a student.
//
//Custom Exception:
//StudentErrorData
//
//Create a class named Result having a Student array.
//
//Create a method validStudentData() which will validate and display the details of the students.
//
//It will throw exceptions as follows:
//
//1. If roll does not contain a value from 1 to n, throw an exception: "Invalid Roll".
//
//2. If roll is duplicate, throw an exception: "Duplicate Roll".
//
//3. If name contains only a first name or a title, throw an exception: "Invalid student name".
//
//4. If mark is not less than 50%, throw an exception: "Failed student".

package exception_try_catch;

import java.util.Scanner;

class StudentErrorData extends Exception {
	StudentErrorData(String s){
		super(s);
	}
}

class Student{
	String name;
	int roll;
	int mark;
	Student(String t_name, int t_roll, int t_mark){
		name = t_name;
		roll = t_roll;
		mark = t_mark;
	}
	void show() {
		System.out.println("Name :: "+name+" | Roll :: "+roll+" | Mark ::"+mark);
	}
}

class Result{
	Student s[];
	Result(Student s[]){
		this.s = s;
	}
	void ValidStudentData(Student stu,int index) throws StudentErrorData{
		if(stu.roll > s.length) {
			throw new StudentErrorData("Invalid Roll");
		}
		for(int i=0;i<index;i++) {
			if(i!=index && s[i].roll==stu.roll) {
				throw new StudentErrorData("Duplicate Roll");
			}
		}
		if(!stu.name.contains(" ")) {
			throw new StudentErrorData("Invalid Name");
		}
		if(stu.mark < 50) {
			throw new StudentErrorData("Failed student data");
		}
		stu.show();
	}
}

public class Student_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int roll;
		int mark;
		
		System.out.println("Number of student :: ");
		int n = sc.nextInt();sc.nextLine();
		Student s1[] = new Student[n];
		System.out.println("Enter student details -- ");
			for(int i=0;i<n;i++) {
			System.out.println("--------------"+(i+1)+"th student details----------------------");
			System.out.print("Enter student roll -> ");
			roll = sc.nextInt();sc.nextLine();
			System.out.print("Enter student name -> ");
			name = sc.nextLine();
			System.out.print("Enter student mark -> ");
			mark = sc.nextInt();sc.nextLine();
			s1[i] = new Student(name.trim(), roll, mark);
		}
		System.out.println("------OUTPUT------");
		Result res = new Result(s1);
		for(int i=0;i<n;i++) {
			try {
				res.ValidStudentData(s1[i], i);
			}
			catch(StudentErrorData e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}

}

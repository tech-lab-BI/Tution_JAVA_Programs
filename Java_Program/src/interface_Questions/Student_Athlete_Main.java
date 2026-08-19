/* Create a abstract class named Person having instance variable name and abstract method - display()
 * Create a class named Student having instance type(college/HS/SSC/below 8...).
 * Also implement the above abstract method display() - all details of a student.
 * Create an interface named Athelete having an abstract method - game().
 * Create a class named SportStudent which implement both Student and Athlete. Create instance variables - isAthlete[boolean]
 * ans a string variable player(athelete department name). Also implement abstract method - game() 
 * : which will diaplay the sport student details with the athelete player type, if yes.
 * Create Main class and from main() take a Sports and Student details as user input and show its details.
*/

package interface_Questions;

import java.util.Scanner;

interface Athlete{
	void game();
}

abstract class Person {
	String name;
	Person(String name){
		this.name = name;
	}
	abstract void display();
}

class Student extends Person{
	String type;
	Student(String name, String type){
		super(name);
		this.type = type;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Type : "+type);
	}
}

class SportStudent extends Student implements Athlete {
	boolean isAthlete;
	String player;
	SportStudent(String name, String type, boolean isAthlete, String player){
		super(name, type);
		this.isAthlete = isAthlete;
		this.player = player;
	}
	public void game() {
		display();
		if(isAthlete) {
			System.out.println("Is-Athlete : "+isAthlete);
			System.out.println("Player : "+player);
		}
	}
}

public class Student_Athlete_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String n, t, p="", isAth;
		boolean isA;
		System.out.print("Enter name : ");
		n = sc.next();
		System.out.print("Enter type : ");
		t = sc.next();
		System.out.print("Is-Athlete(y/n) : ");
		isAth = sc.next();
		isA = (isAth.equals("y"))?true:false;
		if(isA) {
			System.out.print("Enter player :");
			p = sc.next();
		}
		
		SportStudent ob = new SportStudent(n, t, isA, p);
		System.out.println("--------------OUTPUT-------------");
		ob.game();
	}

}

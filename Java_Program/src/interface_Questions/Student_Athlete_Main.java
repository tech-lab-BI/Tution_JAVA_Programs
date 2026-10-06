// Q22 - Create an abstract class named Person having instance variable name and abstract method display().
// Create a child class named Student having instance variable type (college/HS/SSC/below 8...).
// Also implement the above abstract method display() to show all details of a student.
// Create an interface named Athlete having an abstract method game().
// Create a class named SportStudent which extends Student and implements Athlete.
// Create instance variables isAthlete (boolean) and player (athlete department name/sports name).
// Also implement abstract method game() which will display the sports student details along with the athlete player type, if isAthlete is true.
// Create Main class and from main() take Student and Sports details as user input and show its details.
// input  - Name: Rahul, Type: College, Is Athlete: true, Sports Name: Cricket
// output - Name: Rahul, Type: College, Is Athlete: true, Sports Name: Cricket

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

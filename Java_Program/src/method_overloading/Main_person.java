//question - Create a class named Person having instance variables name, contact, age & object of Address. 
//Address is a diff class having instance variables area, dist, state, pin & this class will be
//aggregate in Person class. Create a method named getId(), which will create the ID of the person by 
//1st letter of name & surname followed by last 4 digit of contact number. 
//This method should be overloaded with name & name with contact both. 
//Create another method named getPassword() which will create the password of the person and 
//the password can be generated as the first letters of name and surname followed by '@' + 
//last 5 digit of contact + '#' + each first letter each member in address class + '!' + 
//last digit of age. This method should be overloaded with name, name with contact, name with age, 
//name+contact+age. The person class should have parameterized constructor to initialize the values
//and the constructor should be overloaded with contact and age optional. Create Main class and 
//from main() take a person details as user input with contact and age optional, and generate their ID,
//password and display.
//input - Amit Sharma 9876543210 New_Town Kolkata WB 700001 25
//output - ID: AS3210, Password: AS@654321#NKW7!5

package method_overloading;
import java.util.Scanner;

class Person{
	String name;
	String contact;
	int age;
	Address add;
	
	Person(String name, Address add){
		this.name = name;
		this.contact = null;
		this.age = 0;
		this.add = add;
	}
	Person(String name, String contact, Address add){
		this(name, add);
		this.contact = contact;
	}
	Person(String name, int age, Address add){
		this(name, add);
		this.age = age;
	}
	Person(String name, String contact, int age, Address add){
		this(name, add);
		this.contact = contact;
		this.age = age;
	}
	
	String getID(String n) {
		String id = n.charAt(0)+"";
		int i=0;
		while(n.charAt(i) != ' ') {
			i++;
		}
		id += n.charAt(++i);
		id += "0000";
		
		return id;
	}
	String getID(String n, String con) {
		String id = n.charAt(0)+"";
		int i=0;
		while(n.charAt(i) != ' ') {
			i++;
		}
		id += n.charAt(++i);
		id += con.substring(5);
		return id;
	}	
	
	String getPassword(String n) {
		String pass = n.charAt(0)+"";
		int i=0;
		while(n.charAt(i) != ' ') {
			i++;
		}
		pass += n.charAt(++i)+'@'+"00000"+'#';
//		pass += '@';
//		pass += "00000";
//		pass += '#';
		pass += add.area.charAt(0);
		pass += add.dist.charAt(0);
		pass += add.state.charAt(0);
		pass += String.valueOf(add.pin).charAt(0);
		pass += '!'+'0';
//		pass += '0';
		
		return pass;
	}
	String getPassword(String n, String con) {
		String pass = n.charAt(0)+"";
		int i=0;
		while(n.charAt(i) != ' ') {
			i++;
		}
		pass += n.charAt(++i);
		pass += '@';
		pass += con.substring(5);
		pass += '#';
		pass += add.area.charAt(0);
		pass += add.dist.charAt(0);
		pass += add.state.charAt(0);
		pass += String.valueOf(add.pin).charAt(0);
		pass += '!';
		pass += '0';
		
		return pass;
	}
	String getPassword(String n, int age) {
		String pass = n.charAt(0)+"";
		int i=0;
		while(n.charAt(i) != ' ') {
			i++;
		}
		pass += n.charAt(++i);
		pass += '@';
		pass += "00000";
		pass += '#';
		pass += add.area.charAt(0);
		pass += add.dist.charAt(0);
		pass += add.state.charAt(0);
		pass += String.valueOf(add.pin).charAt(0);
		pass += '!';
		pass += String.valueOf(age%10);
		
		return pass;
	}
	String getPassword(String n, String con, int age) {
		String pass = n.charAt(0)+"";
		int i=0;
		while(n.charAt(i) != ' ') {
			i++;
		}
		pass += n.charAt(++i);
		pass += '@';
		pass += con.substring(5);
		pass += '#';
		pass += add.area.charAt(0);
		pass += add.dist.charAt(0);
		pass += add.state.charAt(0);
		pass += String.valueOf(add.pin).charAt(0);
		pass += '!';
		pass += String.valueOf(age%10);
		
		return pass;
	}
}

class Address{
	String area;
	String dist;
	String state;
	int pin;
	Address(String area, String dist, String state, int pin){
		this.area = area;
		this.dist = dist;
		this.state = state;
		this.pin = pin;
	}
}

public class Main_person {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String contact=null;
		int age=0;
		String area;
		String dist;
		String state;
		int pin;
		char ch1, ch2;
		
		String personID;
		String password;
		
		Person p;
		Address add;
		
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Do you want register your contact(y/n) : ");
		ch1 = sc.nextLine().charAt(0);
		while(ch1 == 'y') {
			System.out.print("Enter contact : ");
			contact = sc.nextLine();
			if(contact.length() == 10)break;
			System.out.println("10 digit number");
		}
		System.out.print("Do you want register your age(y/n) : ");
		ch2 = sc.nextLine().charAt(0);
		if(ch2 == 'y') {
			System.out.print("Enter age : ");
			age = sc.nextInt();sc.nextLine();
		}
		System.out.println("------ADDRESS---------");
		System.out.print("Enter Area : ");
		area = sc.nextLine();
		System.out.print("Enter district : ");
		dist = sc.nextLine();
		System.out.print("Enter state : ");
		state = sc.nextLine();
		System.out.print("Enter pin : ");
		pin = sc.nextInt();
		
		add = new Address(area, dist, state, pin);
		
		if(ch1 == 'n' && ch2 == 'n') {
			p = new Person(name, add);
			personID = p.getID(name);
			password = p.getPassword(name);
		}
		else if(ch1 == 'y' && ch2 == 'n') {
			p = new Person(name, contact, add);
			personID = p.getID(name, contact);
			password = p.getPassword(name, contact);
		}
		else if(ch1 == 'n' && ch2 == 'y') {
			p = new Person(name, age, add);
			personID = p.getID(name);
			password = p.getPassword(name, age);
		}
		else {
			p = new Person(name, contact, age, add);
			personID = p.getID(name, contact);
			password = p.getPassword(name, contact, age);
		}
		
		System.out.println("Person ID : "+personID);
		System.out.println("Password : "+password);
	}

}

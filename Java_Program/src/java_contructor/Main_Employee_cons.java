//question - Create a class named Employee having instance variables id, name, salary, company, 
//contact, secondary_contact, email, dob. Create parameterized constructor and overload 
//the constructor as per requirement where secondary_contact, email & DOB are optional. 
//If secondary_contact is not given as input, then it is assigned as ten '0'. 
//If email is not taken as input, it is assigned as null@gmail.com. 
//If DOB is not taken as input, it is assigned as 00-00-0000. 
//For every employee id will be assigned as 1st letter of name & surname followed by 
//first digit of mobile number and last 4 digit of mobile number. 
//Example — Tushar Bhowmik, 9748912037 -> ID — TB92037. From Main class and from main() 
//take n number of employee details as user input and perform the below operations/methods — 
//1. void show(Employee[]) — this method will display all employee details. 
//2. void showA(Employee[]) — this method will display employee details who is having a 
//valid email and a valid DOB.
//input - 1 Tushar_Bhowmik 50000 ABC 9748912037 NA NA NA
//output - ID: TB92037, Name: Tushar_Bhowmik, Salary: 50000.0, Company: ABC, Contact: 9748912037, Secondary Contact: 0000000000, Email: null@gmail.com, DOB: 00-00-0000

package java_contructor;
import java.util.Scanner;

class Employee{
	String id;
	String name;
	int salary;
	String company;
	String contact;
	String sec_cont;
	String email;
	String DOB;
//	Employee(){
//		sec_cont = "0000000000";
//		email = "null@gmail.com";
//		DOB = "00-00-0000";
//	}
	Employee(String name, int salary, String company, String contact){
//		this();
		int i=0;
		while(name.charAt(i)!=' ') {
			i++;
		}
		id = (name.charAt(0)+"").toUpperCase();
		id += (name.charAt(++i)+"").toUpperCase();
		id += contact.charAt(0);
		id += contact.substring(6);
		this.name = name;
		this.salary = salary;
		this.company = company;
		this.contact = contact;
		
		sec_cont = "0000000000";
		email = "null@gmail.com";
		DOB = "00-00-0000";
	}
	Employee(String name, int salary, String company, String contact, String sec_cont){
		this(name, salary, company, contact);
		this.sec_cont = sec_cont;
	}
	Employee(String name, int salary, String company, String contact, String sec_cont, String email){
		this(name, salary, company, contact, sec_cont);
		this.email = email;
	}
	Employee(String name, int salary, String company, String contact, String sec_cont, String email, String DOB){
		this(name, salary, company, contact, sec_cont, email);
		this.DOB = DOB;
	}
//	void show() {
//		System.out.println("ID = "+id);
//		System.out.println("Name = "+name);
//		System.out.println("Salary = "+salary);
//		System.out.println("Company = "+company);
//		System.out.println("Contact = "+contact);
//		System.out.println("Secondary contact = "+sec_cont);
//		System.out.println("Email = "+email);
//		System.out.println("DOB = "+DOB);
//	}
}

public class Main_Employee_cons {

	public static void show(Employee e[]) {
		for(int i=0;i<e.length;i++) {
			System.out.println("-----------"+(i+1)+"th employee details------------");
			System.out.println("ID = "+e[i].id);
			System.out.println("Name = "+e[i].name);
			System.out.println("Salary = "+e[i].salary);
			System.out.println("Company = "+e[i].company);
			System.out.println("Contact = "+e[i].contact);
			System.out.println("Secondary contact = "+e[i].sec_cont);
			System.out.println("Email = "+e[i].email);
			System.out.println("DOB = "+e[i].DOB);
			System.out.println("------------------------");
		}
	}
	
	public static void showFilter(Employee emp[]) {
		System.out.println("---------------VAILD EMAIL LIST---------------");
		for(Employee e : emp) {
			if(!e.email.substring(0, 4).equals("null")) {
				System.out.println("Name : "+e.name+"| Salary : "+e.salary+"| Company : "+e.company);
			}
		}
		System.out.println("--------------END-----------------------");
		System.out.println("---------------VAILD DOB LIST---------------");
		for(Employee e : emp) {
			if(!e.DOB.substring(0, 3).equals("00")) {
				System.out.println("Name : "+e.name+"| Salary : "+e.salary+"| Company : "+e.company);
			}
		}
		System.out.println("--------------END-----------------------");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int salary;
		String company;
		String contact;
		String sec_cont=null;
		String email=null;
		String DOB=null;
		char c1,c2,c3;
		
		System.out.print("Enter number of Employee : ");
		short n = sc.nextShort();sc.nextLine();
		Employee e[] = new Employee[n];
		
		System.out.println("++++++++++++++++++INPUT FIELD+++++++++++++++++++");
		for(int i=0;i<n;i++) {
			
			System.out.println("------"+(i+1)+"th details------");
			
			System.out.print("Name - ");
			name = sc.nextLine();
			System.out.print("Salary - ");
			salary = sc.nextInt();sc.nextLine();
			System.out.print("Company - ");
			company = sc.nextLine();
//			System.out.print("\tContact - ");
//			contact = sc.nextLine();
			do {
				System.out.print("Contact - ");
				contact = sc.nextLine();
				if(contact.length() == 10) 
					break;
				else
					System.out.println("<ERROR> conatct should be 10 digit");
				//if(sec_cont.length() < 10) System.out.println("Re-enter mobail = ");
			}while(true);
			
			
//			System.out.print("Do you want to enter secondary contact(y/n) : ");
//			c1 = sc.nextLine().charAt(0);
//			if(c1 == 'y') {
//				System.out.print("\tSecondary contact - ");
//				sec_cont = sc.nextLine();
//			}
			System.out.print("Do you want to enter secondary contact(y/n) : ");
			c1 = sc.nextLine().charAt(0);
			if(c1 == 'y') {
				do {
					System.out.print("\tSecondary contact - ");
					sec_cont = sc.nextLine();
					if(sec_cont.length() == 10) 
						break;
					else
						System.out.println("ERROR ! conatct should be 10 digit");
					//if(sec_cont.length() < 10) System.out.println("Re-enter mobail = ");
				}while(true);
			}
			System.out.print("Do you want to enter email(y/n) : ");
			c2 = sc.nextLine().charAt(0);
			if(c2 == 'y') {
				do {
					System.out.print("\tEmail - ");
					email = sc.nextLine();
					int j=0;
					while(email.charAt(j)!='@'&&(j+1)!=email.length()) j++;
					String ve = email.substring(j+1);
					if(ve.equalsIgnoreCase("gmail.com") || ve.equalsIgnoreCase("yahoo.com")) 
						break;
					else
						System.out.println("ERROR ! invalid email.");
				}while(true);
			}
			System.out.print("Do you want to enter DOB(y/n) : ");
			c3 = sc.nextLine().charAt(0);
			if(c3 == 'y') {
				do {
					System.out.print("\tDOB - ");
					DOB = sc.nextLine();
					if((DOB.length()==10 && DOB.charAt(2)==DOB.charAt(5)) && (DOB.charAt(2)=='.' || DOB.charAt(2)=='/' || DOB.charAt(2)=='-'))
						break;
					else
						System.out.println("Error ! invalid DOB");
				}while(true);
			}
			
			if(c1 == 'y' && c2 == 'n' && c3 == 'n') {
				e[i] = new Employee(name, salary, company, contact, sec_cont);
			}
			else if(c1 == 'y' && c2 == 'y' && c3 == 'n') {
				e[i] = new Employee(name, salary, company, contact, sec_cont, email);
			}
			else if(c1 == 'y' && c2 == 'y' && c3 == 'y') {
				e[i] = new Employee(name, salary, company, contact, sec_cont, email, DOB);
			}
			else {
				e[i] = new Employee(name, salary, company, contact);
			}
		}
		System.out.println("++++++++++++++++++INPUT FIELD END+++++++++++++++++++++++++");
		
//		show(e);
		showFilter(e);
	}

}

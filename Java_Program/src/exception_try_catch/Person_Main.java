package exception_try_catch;

import java.util.Scanner;

class ContactException extends Exception {
	ContactException(String s){
		super(s);
	}
}

class Person{
	String name;
	String contact;
	Person(String name, String contact){
		this.name = name;
		this.contact = contact;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Contact : "+contact);
	}
}

public class Person_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,contact;
		
		System.out.println("Enter number of employee : ");
		int n = sc.nextInt();sc.nextLine();
		Person p[] = new Person[n];
		System.out.println("Enter "+n+" employee details : ");
		for(int i=0;i<n;i++) {
			
			System.out.println((i+1)+"th employee :: ");
			System.out.print("NAME :: ");
			name = sc.nextLine();
			System.out.print("CONTACT :: ");
			contact = sc.nextLine();
			if(contact.length()==10) {
				p[i] = new Person(name, contact);
			} else {
				p[i] = null;
			}
			System.out.println("-----------");
		}
		
		System.out.println("------EMPLOYEE DETAILS-----");
		for(int i=0;i<n;i++) {
			try {
				
			System.out.println((i+1)+"th employee - ");
			if(p[i]!=null) {
				p[i].display();
			} else {
				throw new ContactException("Data Not found");
			}
			}
			catch(ContactException e) {
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();
	}

}

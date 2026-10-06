// Q32 - Create a package bank carrying an abstract class Bank and child class Atm.
// In Bank class, encapsulate instance variables: contact, balance, acc_no, and name. Create constructor to generate acc_no (e.g., first letter of first name + last name initial + contact).
// Include abstract methods: void deposit(String acc_no, double amount), void withdraw(int pin, double amount), and void display().
// In Atm class, encapsulate instance variable pin. Implement abstract methods and add void changePin(int oldPin, String acc_no, int newPin) which changes PIN on correct validation or prints "failed".
// Create another package main having class Person with main() method to perform: 1. Input person details 2. Deposit & withdraw operations 3. PIN change 4. Display details.
// input  - Name: John Parle, Contact: 1234567890, Balance: 5000, PIN: 1234
// output - A/C No: JP1234567890, Balance: 5000.0, PIN changed successfully.

package main_application;

import java.util.Scanner;
import rbi.*;

public class Main_bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c=1,ch1,pin;
		String name,contact,ac;
		double taka;
		
		System.out.println("-------Enter A/C opening details--------");
		System.out.print("Name : ");
		name = sc.nextLine();
		do {
			System.out.print("Contact No - ");
			contact = sc.nextLine();
			if(contact.length() == 10)
				break;
			System.out.println("Phone should be 10 digit");
		}while(true);
		System.out.print("Opening Balance : ");
		taka = sc.nextDouble();
		System.out.print("Pin : ");
		pin = sc.nextInt();
		System.out.println("-----------------------------------------");
		Bank ob = new Atm(name, contact, taka, pin);
		System.out.println("a/c created successful. a/c no : "+ob.getAcc_no());
		System.out.println("-----------------------------------------");
		
		
		while(c==1) {
			System.out.print("Choose Your Operation [");
			System.out.println("1. Deposit    2. Withdrawal    3. Change Pin    4. Profile 5. Exit]");
			System.out.print("CHIOCE -- ");
			ch1 = sc.nextInt();
			switch(ch1) {
				case 1:
					System.out.print("Deposit Amount - ");
					taka = sc.nextDouble();sc.nextLine();
					System.out.print("To A/C no - ");
					ac = sc.nextLine();
					ob.deposit(ac, taka);
					break;
				case 2:
					System.out.print("Withdrawal Amount - ");
					taka = sc.nextDouble();
					System.out.print("Enter pin - ");
					pin = sc.nextInt();
					ob.withdrawal(pin, taka);
					break;
				case 3:
					System.out.print("Enter new pin - ");
					pin = sc.nextInt();sc.nextLine();
					System.out.print("a/c no - ");
					ac = sc.nextLine();
					ob.changePin(ac, pin);
					break;
				case 4:
					ob.display();
					break;
				case 5:
					c=0;
					break;
				default:
					System.out.println("---------Wrong Chioce--------");
			}
		}
		sc.close();
	}

}

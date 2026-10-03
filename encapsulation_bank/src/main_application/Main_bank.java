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

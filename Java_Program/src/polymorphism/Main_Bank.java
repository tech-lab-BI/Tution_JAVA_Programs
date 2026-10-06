// unknown - Create a base class Bank having instance variables: acc_no, name, contact, balance, bank, and interest.
// Create a constructor in Bank that generates an account number by appending the sum of the digits of the contact number to the contact string itself.
// Include methods deposit(double balance), withdrawal(double balance), calculateInterest(), and show() to display account details.
// Create 4 child classes named SBI, HDFC, ICICI, and PNB extending Bank, setting their respective bank names and interest rates (SBI: 3.0%, HDFC: 4.0%, ICICI: 5.0%, PNB: 6.0%).
// Create a Main_Bank class with a passbookUpdate method that logs transactions into a string array.
// In main(), use a menu-driven approach to create an account (validating that the contact number is 10 digits) and perform operations: 1. Deposit 2. Withdrawal 3. Balance Check 4. Show passbook 5. Profile 6. Exit.
// input  - Bank Choice: 1 (SBI), Name: Rahul, Contact: 9876543210, Opening Balance: 5000, Operation Choice: 1 (Deposit), Amount: 1000
// output - Amount : 1000.0 successfully deposit at A/C no - 987654321045

package polymorphism;
import java.util.*;

class Bank{
	String acc_no;
	String name;
	String contact;
	double balance;
	String bank;
	double interest;
	
	Bank(String contact){
		int i=0;
		int sum=0;
		while(i < contact.length()) {
			sum += (contact.charAt(i)-'0');
			i++;
		}
		this.acc_no = contact+sum;
	}
	void calculateInterest() {
		System.out.println("working in progress");
	}
	void deposit(double balance) {
		this.balance += balance;
	}
	void withdrawal(double balance) {
		this.balance -= balance;
	}
	void show() {
		System.out.println("------------PERSON DETAILS----------------");
		System.out.println("WELCOME TO "+bank+" BANK");
		System.out.println("A/C no - "+acc_no);
		System.out.println("Person Name - "+name);
		System.out.println("Contact No - "+contact);
		System.out.println("Balance - "+balance);
		System.out.println("-------------------------------------------");
	}
}

class SBI extends Bank{
	SBI(String name, String contact, double balance){
		super(contact);//for acc no create
		this.name = name;
		this.contact = contact;
		this.balance = balance;
		this.bank = "SBI";
		this.interest = 3.0;
	}
	void calculateInterest() {
		System.out.println("working in progress");
	}
}

class HDFC extends Bank{
	HDFC(String name, String contact, double balance){
		super(contact);//for acc no create
		this.name = name;
		this.contact = contact;
		this.balance = balance;
		this.bank = "HDFC";
		this.interest = 4.0;
	}
	void calculateInterest() {
		System.out.println("working in progress");
	}
}

class ICICI extends Bank{
	ICICI(String name, String contact, double balance){
		super(contact);//for acc no create
		this.name = name;
		this.contact = contact;
		this.balance = balance;
		this.bank = "ICICI";
		this.interest = 5.0;
	}
	void calculateInterest() {
		System.out.println("working in progress");
	}
}

class PNB extends Bank{
	PNB(String name, String contact, double balance){
		super(contact);//for acc no create
		this.name = name;
		this.contact = contact;
		this.balance = balance;
		this.bank = "PNB";
		this.interest = 6.0;
	}
	void calculateInterest() {
		System.out.println("working in progress");
	}
}

public class Main_Bank {

	public static String[] passbookUpdate(String[] book,double taka, int type,double balance,int repNo) {
		
		int l = repNo;
		switch(type) {//Recipt No  |  Deposit  |  Withdraw  |  Balance
			case 1://withdrawal
				book[l-1] = "000"+l+"\t"+"\t-\t"+taka+"\t"+balance;
			case 2://deposit
				book[l-1] = "000"+l+"\t"+taka+"\t-\t"+"\t"+balance;
			case 3://balcnce inquary
				book[l-1] = "000"+l+"\t"+"\t-\t"+"\t-\t"+"\t"+balance;
		}
		return book;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch1, ch2;
		String name;
		String contact;
		double taka=0;
		Bank ob=null;
		String passBook[] = new String[100];
		int repNo = 0;
		
		System.out.println("-----CREATE ACCOUNT-----");
		System.out.println("1. SBI    2. HDFC    3. ICICI    4. PNB");
		System.out.print("CHIOCE -- ");
		ch1 = sc.nextInt();sc.nextLine();
		switch(ch1) {
			case 1:
					System.out.println("------------Enter Basic Details----------------");
					System.out.print("Person Name - ");
					name = sc.nextLine();
					do {
						System.out.print("Contact No - ");
						contact = sc.nextLine();
						if(contact.length() == 10)
							break;
						System.out.println("Phone should be 10 digit");
					}while(true);
					
					System.out.print("Opening Balance - ");
					taka = sc.nextDouble();
					ob = new SBI(name, contact, taka);
					System.out.println("------------ACCOUNT CREATED SUCCESSFULLY-----------------");
					break;
			case 2:
				System.out.println("------------Enter Basic Details----------------");
				System.out.print("Person Name - ");
				name = sc.nextLine();
				do {
					System.out.print("Contact No - ");
					contact = sc.nextLine();
					if(contact.length() == 10)
						break;
					System.out.println("Phone should be 10 digit");
				}while(true);
				
				System.out.print("Opening Balance - ");
				taka = sc.nextDouble();
				ob = new HDFC(name, contact, taka);
				System.out.println("------------ACCOUNT CREATED SUCCESSFULLY-----------------");
				break;
			case 3:
				System.out.println("------------Enter Basic Details----------------");
				System.out.print("Person Name - ");
				name = sc.nextLine();
				do {
					System.out.print("Contact No - ");
					contact = sc.nextLine();
					if(contact.length() == 10)
						break;
					System.out.println("Phone should be 10 digit");
				}while(true);
				
				System.out.print("Opening Balance - ");
				taka = sc.nextDouble();
				ob = new ICICI(name, contact, taka);
				System.out.println("------------ACCOUNT CREATED SUCCESSFULLY-----------------");
				break;
			case 4:
				System.out.println("------------Enter Basic Details----------------");
				System.out.print("Person Name - ");
				name = sc.nextLine();
				do {
					System.out.print("Contact No - ");
					contact = sc.nextLine();
					if(contact.length() == 10)
						break;
					System.out.println("Phone should be 10 digit");
				}while(true);
				
				System.out.print("Opening Balance - ");
				taka = sc.nextDouble();
				ob = new PNB(name, contact, taka);
				System.out.println("------------ACCOUNT CREATED SUCCESSFULLY-----------------");
				break;
			default:
					System.out.println("------Wrong choice-----");
		}
		
		while(true) {
			System.out.print("⚒️⚒️⚒️Choose Your Operation [");
			System.out.println("1. Deposit    2. Withdrawal    3. Balance Check    4. Show passbook   5. Profile 6. Exit]");
			System.out.print("CHIOCE -- ");
			ch2 = sc.nextInt();sc.nextLine();
			switch(ch2) {
				case 1:
					System.out.print("Deposit Amount - ");
					taka = sc.nextDouble();
					ob.deposit(taka);
					System.out.println("---------------------------------------------------------------");
					System.out.println("Amount : "+taka+" successfully deposit at A/C no - "+ob.acc_no);
					System.out.println("---------------------------------------------------------------");
					passBook = passbookUpdate(passBook,taka,2,ob.balance,++repNo);
					break;
				case 2:
					System.out.print("Withdrawal Amount - ");
					taka = sc.nextDouble();
					System.out.println("---------------------------------------------------------------");
					if((ob.balance - taka) < 0) {
						System.out.println("Insufficient Balance");
					}
					else {
						ob.withdrawal(taka);
						System.out.println("Amount : "+taka+" successfully withdrawal from A/C no - "+ob.acc_no);
						passBook = passbookUpdate(passBook,taka,1,ob.balance,++repNo);
					}
					System.out.println("---------------------------------------------------------------");
					break;
				case 3:
					System.out.println("---------------------------------------------------------------");
					System.out.println("Amount : "+ob.balance+" at A/C no - "+ob.acc_no);
					System.out.println("---------------------------------------------------------------");
					passBook = passbookUpdate(passBook,0,3,ob.balance,++repNo);
					break;
				case 4:
					System.out.println("---------------------------------------------------------------");
					System.out.println("PASSBOOK OF A/C - "+ob.acc_no);
					System.out.println("Recipt No  |  Deposit  |  Withdraw  |  Balance");
					if(repNo == 0) {
						System.out.println("No statement yet !!");
					}
					else {
						for(int i=0;i<repNo;i++) {
							System.out.println(passBook[i]);
						}
					}
					System.out.println("---------------------------------------------------------------");
					break;
				case 5:
					System.out.println("---------------------------------------------------------------");
					System.out.println("A/C Details");
					ob.show();
					System.out.println("---------------------------------------------------------------");
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("---------Wrong Chioce--------");
			}
		}
	}

}

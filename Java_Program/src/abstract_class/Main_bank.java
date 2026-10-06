// Q - Create an abstract class named Bank having instance variables: name, acc_no (final), contact, balance.
// NOTE: acc_no will be generated using contact_no ending with the sum of its digits, which will be implemented in each class.
// Create parameterized constructor as required.
// Create two abstract methods named deposit(double) and withdraw(double).
// Create a normal method named show(), which will print all the details of the person.
// Create 3 child classes named SBI, ICICI, and HDFC, which will implement the above abstract methods.
// deposit(double) - for every deposit 10% will be added on additional deposit amount for SBI, for ICICI it is 20%, for HDFC it is 15%.
// withdraw(double) - for every withdrawal 5% will be deducted on withdrawal amount as bank charge for SBI, for ICICI - 10%, HDFC - 8%.
// Create Main class. From main(), take input of a person and choose which account he/she is going to open using a menu-driven approach. Perform deposit and withdraw operations until the user exits.
// input  - Name: Rahul, Contact: 9876543210, Initial Balance: 5000, Bank Choice: 1 (SBI), Operation: Deposit 1000
// output - Account Created with Acc No: 987654321045, Deposit Success! New Balance: 6100.0

package abstract_class;

import java.util.*;

abstract class Bank {
	String pname;
	final String acc_no;
	String contact;
	double balance;
	ArrayList<String> passbook = new ArrayList<>();
	Bank(String pname, String contact){
		this.pname = pname;
		int i = contact.length()-1;
		int s = 0;
		while(i>=0) {
			s += Integer.parseInt(contact.charAt(i)+"");
			i--;
		}
		acc_no = contact+String.valueOf(s);
		balance = 0;
	}
	abstract void deposit(double val);
	abstract void withdrawal(double val);
	void checkBalance() {
		System.out.println("A/C balance : "+balance);
	}
	void showPassbook() {
		System.out.println("Serial    Deposit    Deposit-interest   Withdrawal   withdrawal-charge  Balance");
		for(int i=0;i<passbook.size();i++) {
			System.out.println(passbook.get(i));
		}
	}
}

class SBI extends Bank {
	double dRate = 0.1;
	double wRate = 0.05;
	SBI(String pname, String contact){
		super(pname, contact);
	}
	void deposit(double val) {
		if(val < 0) {
			System.out.println("If you haven't money , go earn it first");
			return;
		}
		balance += val + (val*dRate);
		String transection = (passbook.size()+1)+"         "+val+"           "+(val*dRate)+"          "+"     0      "+"           "+"     0      "+"        "+balance;
		passbook.add(transection);
	}
	void withdrawal(double val) {
		double t = val+(val*wRate);
		if(t > balance) {
			System.out.println("Not enouth balance.");
			return;
		}
		balance -= t;
		System.out.println((val*wRate) + " debit for A/C charge.");
		String transection = (passbook.size()+1)+"        "+"     0     "+"       "+"      0       "+"      "+val+"         "+(val*wRate)+"        "+balance;
		passbook.add(transection);
	}
}
class ICICI extends Bank {
	double dRate = 0.20;
	double wRate = 0.10;
	ICICI(String pname, String contact){
		super(pname, contact);
	}
	void deposit(double val) {
		if(val < 0) {
			System.out.println("If you haven't money , go earn it first");
			return;
		}
		balance += val + (val*dRate);
		String transection = (passbook.size()+1)+"         "+val+"           "+(val*dRate)+"          "+"     0      "+"           "+"     0      "+"        "+balance;
		passbook.add(transection);
	}
	void withdrawal(double val) {
		double t = val+(val*wRate);
		if(t > balance) {
			System.out.println("Not enouth balance.");
			return;
		}
		balance -= t;
		System.out.println((val*wRate) + " debit for A/C charge.");
		String transection = (passbook.size()+1)+"        "+"     0     "+"       "+"      0       "+"      "+val+"         "+(val*wRate)+"        "+balance;
		passbook.add(transection);
	}
}
class HDFC extends Bank {
	double dRate = 0.15;
	double wRate = 0.08;
	HDFC(String pname, String contact){
		super(pname, contact);
	}
	void deposit(double val) {
		if(val < 0) {
			System.out.println("If you haven't money , go earn it first");
			return;
		}
		balance += val + (val*dRate);
		String transection = (passbook.size()+1)+"         "+val+"           "+(val*dRate)+"          "+"     0      "+"           "+"     0      "+"        "+balance;
		passbook.add(transection);
	}
	void withdrawal(double val) {
		double t = val+(val*wRate);
		if(t > balance) {
			System.out.println("Not enouth balance.");
			return;
		}
		balance -= t;
		System.out.println((val*wRate) + " debit for A/C charge.");
		String transection = (passbook.size()+1)+"        "+"     0     "+"       "+"      0       "+"      "+val+"         "+(val*wRate)+"        "+balance;
		passbook.add(transection);
	}
}

public class Main_bank {
	
	static void login(Scanner sc, Bank ob) {
		double val;
		while(true) {
			System.out.print("1. deposit\n2. withdrawal\n3. Check balance\n4. Passbook\n5. exit\n choose :: ");
			int ch = sc.nextInt();
			System.out.println("-------------------------------------");
			switch(ch) {
				case 1 :
					System.out.print("Enter Deposit value :: ");
					val = sc.nextDouble();
					ob.deposit(val);
					break;
				case 2 :
					System.out.print("Enter withdrawal value  :: ");
					val = sc.nextDouble();
					ob.withdrawal(val);
					break;
				case 3 :
					ob.checkBalance();
					break;
				case 4 :
					ob.showPassbook();
					break;
				case 5:
					System.exit(0);
				default :
					System.out.println("Wrong chioce");
			}
			System.out.println("-------------------------------------");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		String name,contact="";
		Bank ob=null;
		
		System.out.print("1. SBI\n2. ICICI\n3. HDFC\n choose :: ");
		ch = sc.nextInt();sc.nextLine();
		System.out.print("Enter Person Name : ");
		name = sc.nextLine();
		while(true){
			if(contact.length() == 10)
				break;
			System.out.print("Enter contact : ");
			contact = sc.nextLine();
		}
		
		switch(ch) {
			case 1 :
				ob = new SBI(name, contact);
				login(sc, ob);
				break;
			case 2 :
				ob = new ICICI(name, contact);
				login(sc, ob);
				break;
			case 3 :
				ob = new HDFC(name, contact);
				login(sc, ob);
				break;
			case 4:
				System.exit(0);
			default :
				System.out.println("Wrong chioce");
		}
	}

}

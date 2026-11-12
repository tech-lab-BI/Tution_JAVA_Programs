//48. Create an abstract class named `Bank` having the following instance variables: `name`, `balance`, and `point`.
//
//Create a parameterized constructor and two abstract methods:
//
//- `void deposit(double amt)`
//- `void withdraw(int amt)`
//
//Create a normal method `show()` to display the details of a customer. Also, encapsulate the class.
//
//Create three child classes named `SBI`, `ICICI`, and `HDFC`. Override the above two abstract methods in each child class.
//
//**Deposit Method:**
//
//For every deposit, cashback points will be added based on the deposited amount as follows:
//
//- SBI: 10% of the deposited amount.
//- ICICI: 20% of the deposited amount.
//- HDFC: 15% of the deposited amount.
//
//**Withdraw Method:**
//
//For every withdrawal, a percentage of the withdrawal amount will be deducted as follows:
//
//- SBI: 5% of the withdrawal amount.
//- ICICI: 10% of the withdrawal amount.
//- HDFC: 7% of the withdrawal amount.
//
//**Main Class:**
//
//From the `Main` class and its `main()` method:
//
//1. Take customer details as user input.
//2. Open a bank account according to the user's choice.
//3. Create an object of the corresponding `Bank` child class using runtime polymorphism.
//4. Allow the user to perform deposit and withdrawal operations repeatedly (infinitely, until the user chooses to exit).
//5. Store all transaction details in an `ArrayList` with the following structure:
//
//Transaction Number (no): 1 | Deposit: 100 | Withdraw: 0 | Balance: 300 | Cashback: 10
//
//Transaction Number (no): 2 | Deposit: 0 | Withdraw: 50 | Balance: 250 | Cashback: 7.5
//
//Transaction Number (no): 3 | Deposit: ... | Withdraw: ... | Balance: ... | Cashback: ...
//
//**Perform the following operations using a menu-driven approach based on transaction details:**
//
//1. Find the top `n` transactions, where `n` is provided by the user.
//2. Find the bottom `n` transactions, where `n` is provided by the user.
//3. Display transaction details for withdrawal transactions only.
//4. Display transaction details for deposit transactions only.
//5. Find the transactions with the maximum deposit amount and maximum withdrawal amount.

package misc;
import java.util.*;

abstract class Bank {
	private String pname;
	private double balance;
	private String bank;
	private double point;
	ArrayList<LinkedList> passbook = new ArrayList<LinkedList>();
	Bank(String pname, double balance, String bank){
		this.pname = pname;
		this.balance = balance;
		this.bank = bank;
		point = 0;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	abstract void deposit(double val);
	abstract void withdrawal(double val);
	void show() {
		System.out.println("Name : "+pname);
		System.out.println("Balance : "+balance);
		System.out.println("Bank : "+bank);
		System.out.println("Point : "+point);
	}
	void showTransection() {
		System.out.println("No.  Dep.  Wit. Bal. CashBack");
	}
}

class SBI extends Bank {
	double dRate = 0.1;
	double wRate = 0.05;
	SBI(String name, double bal){
		super(name, bal, "SBI");
	}
	void deposit(double val) {
		if(val < 0) {
			System.out.println("If you haven't money , go earn it first");
			return;
		}
		setBalance(getBalance() + val);
		setPoint(getPoint()+(val*dRate));
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(val);
		l.add(0.0);
		l.add(getPoint());
		passbook.add(l);
	}
	void withdrawal(double val) {
		if(val > getBalance()) {
			System.out.println("Not enouth balance.");
			return;
		}
		setBalance(getBalance() - val);
		setPoint(getPoint()-(val*dRate));
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(val);
		l.add(0.0);
		l.add(getPoint());
		passbook.add(l);
	}
}
class ICICI extends Bank {
	double dRate = 0.20;
	double wRate = 0.10;
	ICICI(String name, double bal){
		super(name, bal, "SBI");
	}
	void deposit(double val) {
		if(val < 0) {
			System.out.println("If you haven't money , go earn it first");
			return;
		}
		setBalance(getBalance() + val);
		setPoint(getPoint()+(val*dRate));
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(val);
		l.add(0.0);
		l.add(getPoint());
		passbook.add(l);
	}
	void withdrawal(double val) {
		if(val > getBalance()) {
			System.out.println("Not enouth balance.");
			return;
		}
		setBalance(getBalance() - val);
		setPoint(getPoint()-(val*dRate));
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(val);
		l.add(0.0);
		l.add(getPoint());
		passbook.add(l);
	}
}
class HDFC extends Bank {
	double dRate = 0.15;
	double wRate = 0.08;
	HDFC(String name, double bal){
		super(name, bal, "SBI");
	}
	void deposit(double val) {
		if(val < 0) {
			System.out.println("If you haven't money , go earn it first");
			return;
		}
		setBalance(getBalance() + val);
		setPoint(getPoint()+(val*dRate));
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(val);
		l.add(0.0);
		l.add(getPoint());
		passbook.add(l);
	}
	void withdrawal(double val) {
		if(val > getBalance()) {
			System.out.println("Not enouth balance.");
			return;
		}
		setBalance(getBalance() - val);
		setPoint(getPoint()-(val*dRate));
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(val);
		l.add(0.0);
		l.add(getPoint());
		passbook.add(l);
	}
}

public class Bank_Main {

	static void transection(Scanner sc, Bank ob) {
		double val;
		while(true) {
			System.out.print("1. deposit\n2. withdrawal\n3. Show\n4. transection5. exit\n choose :: ");
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
					ob.show();
					break;
				case 4:
					
				case 5:
					System.exit(0);
				default :
					System.out.println("Wrong chioce");
			}
			System.out.println("-------------------------------------");
		}
	}
	static void login(Scanner sc, Bank ob) {
		double val;
		while(true) {
			System.out.print("1. deposit\n2. withdrawal\n3. Show\n4. transection\n5. exit\n choose :: ");
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
					ob.show();
					break;
				case 4:
					transection(sc, ob);
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
		String name;
		double balance;
		Bank ob = null;
		
		System.out.print("1. SBI\n2. ICICI\n3. HDFC\n choose :: ");
		ch = sc.nextInt();sc.nextLine();
		System.out.print("Enter Person Name : ");
		name = sc.nextLine();
		System.out.print("Enter Initial Balance : ");
		balance = sc.nextDouble();
		switch(ch) {
			case 1 :
				ob = new SBI(name, balance);
				login(sc, ob);
				break;
			case 2 :
				ob = new ICICI(name, balance);
				login(sc, ob);
				break;
			case 3 :
				ob = new HDFC(name, balance);
				login(sc, ob);
				break;
			case 4:
				System.exit(0);
			default :
				System.out.println("Wrong chioce");
		}
	}

}
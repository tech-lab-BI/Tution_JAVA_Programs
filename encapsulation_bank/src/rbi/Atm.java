package rbi;

public class Atm extends Bank{
	private int pin;

	public Atm(String name, String contact, double balance, int pin) {
		int i=0;
		String t = name.charAt(i)+"";
		while(name.charAt(i) != ' ') {
			if((i+2)==name.length())
				break;
			i++;
		}
		t += name.charAt(i+1)+contact;
		super.setName(name);
		super.setContact(contact);
		super.setAcc_no(t);
		super.setBalance(balance);
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void deposit(String ac, double taka) {
		if(taka > 0) {
			if(ac.equals(super.getAcc_no())) {
				super.setBalance(super.getBalance()+taka);
				System.out.println("---------------------------------------------------------------");
				System.out.println("Amount : "+taka+" successfully deposit at A/C no - "+super.getAcc_no());
				System.out.println("---------------------------------------------------------------");
			} else {
				System.out.println("---------------------------------------------------------------");
				System.out.println("A/C not match our database.");
				System.out.println("---------------------------------------------------------------");
			}
		} else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Invaild amount !");
			System.out.println("---------------------------------------------------------------");
		}
	}
	public void withdrawal(int pin, double taka) {
		if(taka > 0) {
			if( pin == this.pin) {
				double bal = super.getBalance();
				if(bal >= taka) {
					super.setBalance(bal-taka);
					System.out.println("---------------------------------------------------------------");
					System.out.println("Amount : "+taka+" successfully withdrawal from A/C no - "+super.getAcc_no());
					System.out.println("---------------------------------------------------------------");
				} else {
					System.out.println("---------------------------------------------------------------");
					System.out.println("Not enough balance");
					System.out.println("---------------------------------------------------------------");
				}
			} else {
				System.out.println("---------------------------------------------------------------");
				System.out.println("Incorrect pin");
				System.out.println("---------------------------------------------------------------");
			}
		} else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Invaild amount !");
			System.out.println("---------------------------------------------------------------");
		}
	}
	public void display() {
		System.out.println("-------A/C details--------");
		System.out.println("Name : "+super.getName());
		System.out.println("A/C no : "+super.getAcc_no());
		System.out.println("Contact : "+super.getContact());
		System.out.println("Balance : "+super.getBalance());
		System.out.println("----------------------------");
	}
	public void changePin(String ac,int newPin) {
		if(ac.equals(super.getAcc_no())) {
			this.pin = newPin;
			System.out.println("---------------------------------------------------------------");
			System.out.println("Pin change succesfuly.");
			System.out.println("---------------------------------------------------------------");
		} else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Incorrect A/C no !");
			System.out.println("---------------------------------------------------------------");
		}
	}
}

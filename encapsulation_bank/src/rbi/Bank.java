package rbi;

public abstract class Bank {
	private String name;
	private String contact;
	private String acc_no;
	private double balance;
	public abstract void deposit(String ac, double taka);
	public abstract void withdrawal(int pin, double taka);
	public abstract void changePin(String ac,int newPin);
	public abstract void display();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

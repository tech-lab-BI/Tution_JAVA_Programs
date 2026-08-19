package interface_Questions;

import java.util.*;

interface Payment {
	void pay(double amt);
	void charge(double amt);
}

class CreditCard implements Payment {
	double balance = 0;
	double charge_bal = 0;

	public void pay(double amt) {
		balance += amt;
		charge(amt);
	}

	public void charge(double amt) {
		charge_bal += (amt * 0.05);
	}
}

class UPI implements Payment {
	double balance = 0;
	double charge_bal = 0;

	public void pay(double amt) {
		balance += amt;
		charge(amt);
	}

	public void charge(double amt) {
		charge_bal += (amt * 0.01);
	}
}

class Paypal implements Payment {
	double balance = 0;
	double charge_bal = 0;

	public void pay(double amt) {
		balance += amt;
		charge(amt);
	}

	public void charge(double amt) {
		charge_bal += (amt * 0.02);
	}
}

public class Checkout_Main {

	static ArrayList<String> t = new ArrayList<>();
	static ArrayList<Double> d = new ArrayList<>();

	static void display(CreditCard c, UPI u, Paypal p) {
		double cBal, uBal, pBal;
		double cCh, uCh, pCh;

		if (c == null) {
			cBal = 0;
			cCh = 0;
		} else {
			cBal = c.balance;
			cCh = c.charge_bal;
		}

		if (u == null) {
			uBal = 0;
			uCh = 0;
		} else {
			uBal = u.balance;
			uCh = u.charge_bal;
		}

		if (p == null) {
			pBal = 0;
			pCh = 0;
		} else {
			pBal = p.balance;
			pCh = p.charge_bal;
		}

		System.out.println();
		System.out.println("============================================================");
		System.out.println("                    PAYMENT SUMMARY");
		System.out.println("============================================================");

		System.out.println();
		System.out.println("------------------------ CREDIT CARD -----------------------");
		System.out.printf("%-25s : %.2f%n", "Total Balance", cBal);
		System.out.printf("%-25s : %.2f%n", "Charge Balance", cCh);
		System.out.printf("%-25s : %.2f%n", "Remaining Balance", (cBal - cCh));
		System.out.println("------------------------------------------------------------");

		System.out.println();
		System.out.println("---------------------------- UPI ---------------------------");
		System.out.printf("%-25s : %.2f%n", "Total Balance", uBal);
		System.out.printf("%-25s : %.2f%n", "Charge Balance", uCh);
		System.out.printf("%-25s : %.2f%n", "Remaining Balance", (uBal - uCh));
		System.out.println("------------------------------------------------------------");

		System.out.println();
		System.out.println("-------------------------- PAYPAL --------------------------");
		System.out.printf("%-25s : %.2f%n", "Total Balance", pBal);
		System.out.printf("%-25s : %.2f%n", "Charge Balance", pCh);
		System.out.printf("%-25s : %.2f%n", "Remaining Balance", (pBal - pCh));
		System.out.println("------------------------------------------------------------");

		System.out.println();
		System.out.println("=========================== FINAL ==========================");
		System.out.printf("%-25s : %.2f%n", "Total Balance",
				(cBal + uBal + pBal));
		System.out.printf("%-25s : %.2f%n", "Charge Balance",
				(cCh + uCh + pCh));
		System.out.printf("%-25s : %.2f%n", "Remaining Balance",
				((cBal + uBal + pBal) - (cCh + uCh + pCh)));
		System.out.println("============================================================");
		System.out.println();
	}

	static void transection(String s) {
		t.add(s);
	}

	static void showHistory() {
		System.out.println();
		System.out.println("============================================================");
		System.out.println("                     PAYMENT HISTORY");
		System.out.println("============================================================");

		System.out.printf("%-22s %15s %15s%n",
				"Payment Method", "Balance", "Charge");

		System.out.println("------------------------------------------------------------");

		for (String s : t) {
			System.out.println(s);
		}

		System.out.println("============================================================");
		System.out.println();
	}

	static void top3() {
		int l = d.size();
		d.sort(null);

		System.out.println();
		System.out.println("============================================================");
		System.out.println("                    TOP PAYMENTS");
		System.out.println("============================================================");

		if (l == 0)
			System.out.println("                    No inputs found");
		else {
			System.out.printf("%-10s : %.2f%n", "Top 1", d.get(d.size() - 1));

			if (l == 2)
				System.out.printf("%-10s : %.2f%n", "Top 2", d.get(d.size() - 2));

			if (l == 3)
				System.out.printf("%-10s : %.2f%n", "Top 3", d.get(d.size() - 3));
		}

		System.out.println("============================================================");
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CreditCard c = null;
		UPI u = null;
		Paypal p = null;

		double amt = 0;
		String s = "";

		while (true) {

			System.out.println("============================================================");
			System.out.println("                     PAYMENT CHECKOUT");
			System.out.println("============================================================");
			System.out.println("   1.  Credit Card");
			System.out.println("   2.  UPI");
			System.out.println("   3.  Paypal");
			System.out.println("   4.  Display Summary");
			System.out.println("   5.  Payment History");
			System.out.println("   6.  Top 3 Payments");
			System.out.println("   7.  Exit");
			System.out.println("------------------------------------------------------------");
			System.out.print("   Choose an option : ");

			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				do {
					if (amt < 0)
						System.out.println("   [!] Negative amount. Please enter again.");

					System.out.print("   Enter amount : ");
					amt = sc.nextDouble();

				} while (amt < 0);

				if (c == null)
					c = new CreditCard();

				c.pay(amt);
				d.add(amt);

				s = String.format(
						"%-22s +%-14.2f -%.2f",
						"Credit Card", amt, (amt * 0.05));

				transection(s);

				System.out.println("   [✓] Credit Card payment successful!");
				break;

			case 2:
				do {
					if (amt < 0)
						System.out.println("   [!] Negative amount. Please enter again.");

					System.out.print("   Enter amount : ");
					amt = sc.nextDouble();

				} while (amt < 0);

				if (u == null)
					u = new UPI();

				u.pay(amt);
				d.add(amt);

				s = String.format(
						"%-22s +%-14.2f -%.2f",
						"UPI", amt, (amt * 0.01));

				transection(s);

				System.out.println("   [✓] UPI payment successful!");
				break;

			case 3:
				do {
					if (amt < 0)
						System.out.println("   [!] Negative amount. Please enter again.");

					System.out.print("   Enter amount : ");
					amt = sc.nextDouble();

				} while (amt < 0);

				if (p == null)
					p = new Paypal();

				p.pay(amt);
				d.add(amt);

				s = String.format(
						"%-22s +%-14.2f -%.2f",
						"Paypal", amt, (amt * 0.02));

				transection(s);

				System.out.println("   [✓] Paypal payment successful!");
				break;

			case 4:
				display(c, u, p);
				break;

			case 5:
				showHistory();
				break;

			case 6:
				top3();
				break;

			case 7:
				System.out.println();
				System.out.println("============================================================");
				System.out.println("              Thank you for using Checkout!");
				System.out.println("============================================================");
				System.exit(0);

			default:
				System.out.println();
				System.out.println("   [!] Wrong choice! Please select 1 - 7.");
				System.out.println();
			}
		}
	}
}
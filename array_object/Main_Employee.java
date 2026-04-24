package array_object;

import java.util.Scanner;

class Employee{
	short id;
	String name;
	double sal;
	Address add;
	void display() {
		System.out.print("ID : "+id+", Name : "+name+", Salary : "+sal);
		add.show();
	}
}

class Address{
	String area;
	String city;
	String state;
	int pin;
	void show() {
		System.out.println(" | Address :: "+area+","+city+","+state+","+pin);
	}
}

public class Main_Employee {

	static void maxSal(Employee e[], Scanner sc) {
		System.out.print("Enter city for highest Salary :: ");
		String ci = sc.nextLine();
		double maxSal=0;
		int maxI=-1;
		for(int i=0;i<e.length;i++) {
			if((e[i].add.city.equalsIgnoreCase(ci)) && e[i].sal > maxSal) {
				maxSal = e[i].sal;
				maxI=i;
			}
		}
		if(maxI == -1) {
			System.out.println("No employee under "+ci);
			return;
		}
		System.out.println("Who got max salary - ");
		e[maxI].display();
	}
	
	static void empDetailsCity(Employee e[], Scanner sc) {
		int count=0;
		System.out.print("Enter city for all employee:: ");
		String ci = sc.nextLine();
		for(int i=0;i<e.length;i++) {
			if(e[i].add.city.equalsIgnoreCase(ci)) {
				System.out.println((++count)+") Emp-Name : "+e[i].name);
			}
		}
		if(count==0) {
			System.out.println("No employee under "+ci);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Employee : ");
		short n = sc.nextShort();sc.nextLine();
		Employee e[] = new Employee[n];
		
		for(int i=0;i<n;i++) {
			
			e[i] = new Employee();
			Address ad = new Address();
			e[i].add = ad;
			
			System.out.println((i+1)+"th details------------------------");
			e[i].id = (short)(100+i);
			
			System.out.print("Name - ");
			e[i].name = sc.nextLine();
			System.out.print("Salary - ");
			e[i].sal = sc.nextDouble();sc.nextLine();
			
			System.out.print("\tArea - ");
			e[i].add.area = sc.nextLine();
			System.out.print("\tCity - ");
			e[i].add.city = sc.nextLine();
			System.out.print("\tState - ");
			e[i].add.state = sc.nextLine();
			System.out.print("\tPin - ");
			e[i].add.pin = sc.nextInt();sc.nextLine();
		}
		
		System.out.println("--------------------------------------------");
		maxSal(e, sc);
		System.out.println("--------------------------------------------");
		empDetailsCity(e, sc);
		
	}

}

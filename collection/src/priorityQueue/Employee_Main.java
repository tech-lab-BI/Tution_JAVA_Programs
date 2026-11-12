//Q47) WAP to create a class `Employee` having the following instance variables:**
//- `name`
//- `comp`
//- `sal`
//Create a parameterized constructor and a method `void show()`, which will print the details of the employee.
//Take `n` employees as user input and store them in a `PriorityQueue`.
//Delete an employee from the priority queue using a switch-case menu.
//The employee having a lower salary than the other employees should be deleted first.
//If the salaries of two employees are the same, then the employee whose name comes first alphabetically should be deleted.

package priorityQueue;
import java.util.*;

class Employee{
	String name;
	String comp;
	int sal;
	Employee(String name,String comp,int sal){
		this.name = name;
		this.comp = comp;
		this.sal = sal;
	}
	void employeeDetails() {
		System.out.println("Name : "+name);
		System.out.println("Company : "+comp);
		System.out.println("Salary : "+sal);
	}
}

class MyComp2 implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		if(o1.sal > o2.sal)
			return 1;
		else if(o1.sal < o2.sal)
			return -1;
		else
			if(o1.name.compareTo(o2.name) > 0)
				return 1;
			else if(o1.name.compareTo(o2.name) < 0)
				return -1;
			else
				return 0;
	}
}

public class Employee_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,comp;
		int sal;
		PriorityQueue<Employee> p = new PriorityQueue<Employee>(new MyComp2());
		System.out.print("Number Employee : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+"th Employee ----");
			sc.nextLine();
			System.out.print("Name : ");
			name = sc.nextLine();
			System.out.print("Comp : ");
			comp = sc.nextLine();
			System.out.print("Sal : ");
			sal = sc.nextInt();
			p.add(new Employee(name, comp, sal));
		}
		System.out.println("Deleted Emploee ---------");
		p.poll().employeeDetails();
	}

}


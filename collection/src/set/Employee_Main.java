// Q51 - Create a class Emp having instance variables id, name, salary.
// Create parameterized constructors and a display() method which will display the details of Emp.
// Create Main and from main() take n number of Emp details as user input and print the Emp details sorted by Emp id (or name).
// If 2 Emp id (or name) are same, the details will be printed whose salary is higher.

package set;
import java.util.*;

class Emp implements Comparable<Emp> {
	int id;
	String name;
	int salary;
	public Emp(int id, String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ID : "+id+" Name : "+name+" Salary : "+salary;
	}
	public int compareTo(Emp o) {
		if(this.name.compareTo(o.name) > 0)
			return 1;
		else if(this.name.compareTo(o.name) < 0)
			return -1;
		else {
			if(this.salary < o.salary)
				return 1;
			else if(this.salary > o.salary)
				return -1;
			else
				return 0;
		}
	}
}
public class Employee_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,salary;
		String name;
		System.out.print("Number of Employee : ");
		int n = sc.nextInt();
		TreeSet<Emp> ts = new TreeSet<Emp>();
		System.out.println("Enter employee details --- ");
		for(int i=0;i<n;i++) {
			System.out.print("ID : ");
			id = sc.nextInt();sc.nextLine();
			System.out.print("Name : ");
			name = sc.nextLine();
			System.out.print("Salary : ");
			salary = sc.nextInt();
			ts.add(new Emp(id, name, salary));
		}
		for(Emp e : ts) {
			System.out.println(e);
		}
		sc.close();
	}

}

// Exam2 - Create a class Employee with attributes id (int), name (String), designation (String), salary (double), along with a parameterized constructor and getter methods getSalary() and getDesignation().
// Create a class Company with private attributes companyName (String), employees (Employee array), numEmployees (int), and a parameterized constructor.
// Implement three methods in Company class:
// 1. getAverageSalary(): Returns average salary of all employees.
// 2. getMaxSalary(): Returns highest salary among all employees.
// 3. getEmployeesByDesignation(String designation): Returns an array of matching employees sorted by salary in increasing order (case-insensitive).
// In main(), read company name, number of employees, and employee details via Scanner. Create a Company object and print average salary, max salary, and matching employee details for a target designation.
// input  - Company: ABC Company, Num: 3, Emp1: 101 John Manager 5000, Emp2: 102 Jane Engineer 5000, Emp3: 103 Bob Engineer 4500, Search Designation: Engineer
// output - Average salary: 4833.33, Max salary: 5000.0, Employees with designation Engineer: ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0 | ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 5000.0

package exam_25_07_2026;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	String design;
	double sal;
	
	Employee(int id, String name, String design, double sal){
		this.id = id;
		this.name = name;
		this.design = design;
		this.sal = sal;
	}
	
	double getSalary() {
		return sal;
	}
	
	String getDesign() {
		return design;
	}
}

class Company{
	String comName;
	Employee e[];
	int numEmp;
	Company(String comName, Employee e[], int numEmp){
		this.comName = comName;
		this.e = e;
		this.numEmp = numEmp;
	}
	
	double getAvgSal() {
		int i,s=0;
		for(i=0;i<e.length;i++) {
			s += e[i].sal;
		}
		return (s/e.length);
	}
	
	double maxSal() {
		int i;
		double m=0;
		for(i=0;i<e.length;i++) {
			if(e[i].sal > m) {
				m = e[i].sal;
			}
		}
		return m;
	}
	
	Employee[] getDetailsByDeg(String deg) {
		Employee resE[] = new Employee[e.length];
		
		int i=0,j=0;
		while(i<e.length) {
			if(e[i].design.equalsIgnoreCase(deg)) {
				resE[j++] = e[i];
			}
			i++;
		}
		if(resE[0] == null)
			return null;
		return resE;
	}
	
}

public class Main_Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		String design;
		double sal;
		
		System.out.print("Enter company name : ");
		String comName = sc.nextLine();
		System.out.print("Enter number of Employee : ");
		int n = sc.nextInt();sc.nextLine();
		Employee e[] = new Employee[n];
		Company c = new Company(comName, e, n);
		
		for(int i=0;i<n;i++) {
	
			System.out.println((i+1)+"th Employee details------------------------");
			
			System.out.print("id - ");
			id = sc.nextInt();sc.nextLine();
			System.out.print("Name - ");
			name = sc.nextLine();
			System.out.print("Designation - ");
			design = sc.nextLine();
			System.out.print("Salary - ");
			sal = sc.nextDouble();sc.nextLine();
			
			e[i] = new Employee(id, name, design, sal);
		}
		
		System.out.println("--------------------------------------------");
		double as = c.getAvgSal();
		System.out.println("Avg salary :: "+as);
		double ms = c.maxSal();
		System.out.println("Max salary :: "+ms);
		
		System.out.println("Enter Designation :: ");
		design = sc.nextLine();
		Employee resE[] = c.getDetailsByDeg(design);
		
		System.out.println("Employee based on design ->"+design);
		if(resE == null) {
			System.out.println("No Employee is avilable");
		}else {
			for(int i=0;i<resE.length;i++) {
				if(resE[i] == null) break;
				System.out.println(resE[i].id+", "+resE[i].name+", "+resE[i].sal);
			}
		}
		
		
	}

}


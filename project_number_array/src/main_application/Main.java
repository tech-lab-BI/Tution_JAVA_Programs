package main_application;

import java.util.Scanner;
import number.check.*;
import adt.*;
import array.*;

public class Main {

	static void allCheck(int n) {
		if(new Prime(n).check_Prime()) {
			System.out.println(n+" is Prime.");
		} else {
			System.out.println(n+" is not a Prime.");
		}
		if(new Perfect(n).check_Perfect()) {
			System.out.println(n+" is Perfect.");
		} else {
			System.out.println(n+" is not a Perfect.");
		}
		if(new Strong(n).check_Strong()) {
			System.out.println(n+" is Strong.");
		} else {
			System.out.println(n+" is not a Strong.");
		}
		if(new Armstrong(n).check_Armstrong()) {
			System.out.println(n+" is Armstrong.");
		} else {
			System.out.println(n+" is not a Armstrong.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch,n=0,t;
		int arr[];
		Student stu[];
		Employee emp[];
		String name,com;
		int sal, roll, mark;
		System.out.print("1. single digit    2. array\nchoose : ");
		ch = sc.nextInt();
		if(ch == 2) {
			System.out.println("1. number   2. Student  3. Employee\nchoose");
			ch = sc.nextInt();
		} else {
			ch = 0;// if choose 1(single digit) convert for switch case into '0'
		}
		switch(ch) {
			case 0:
				System.out.println("Enter single digit : ");
				n = sc.nextInt();
				allCheck(n);
				break;
			case 1:
				System.out.println("Enter number of element : ");
				n = sc.nextInt();
				arr = new int[n];
				System.out.print("Enter array element : ");
				for(int i=0;i<n;i++) {
					arr[i] = sc.nextInt();
				}
				new Max(arr).display();
				t = new Max(arr).getMax();
				System.out.println("Max = "+t);
				t = new Min(arr).getMin();
				System.out.println("Min = "+t);
				t = new Sum(arr).getSum();
				System.out.println("Sum = "+t);
				break;
			case 2:
				System.out.println("Enter number of Student : ");
				n = sc.nextInt();sc.nextLine();
				stu = new Student[n];
				System.out.print("Enter student details : ");
				for(int i=0;i<n;i++) {
					System.out.print("\n--------\n");
					System.out.print("Name : ");
					name = sc.nextLine();
					System.out.print("Roll : ");
					roll = sc.nextInt();
					System.out.print("mark : ");
					mark = sc.nextInt();sc.nextLine();
					
					stu[i] = new Student(name, roll, mark);
				}
				new Max(stu).display();
				t = new Max(stu).getMax();
				System.out.println("Max = "+t);
				t = new Min(stu).getMin();
				System.out.println("Min = "+t);
				t = new Sum(stu).getSum();
				System.out.println("Sum = "+t);
				break;
			case 3:
				System.out.println("Enter number of Employee : ");
				n = sc.nextInt();sc.nextLine();
				emp = new Employee[n];
				System.out.print("Enter student details : ");
				for(int i=0;i<n;i++) {
					System.out.print("\n--------\n");
					System.out.print("Name : ");
					name = sc.nextLine();
					System.out.print("sal : ");
					sal = sc.nextInt();sc.nextLine();
					System.out.print("com : ");
					com = sc.nextLine();
					
					emp[i] = new Employee(name, sal, com);
				}
				new Max(emp).display();
				t = new Max(emp).getMax();
				System.out.println("Max = "+t);
				t = new Min(emp).getMin();
				System.out.println("Min = "+t);
				t = new Sum(emp).getSum();
				System.out.println("Sum = "+t);
				break;
			default:
				System.out.println("Wrong choice !!");
		}
		
		
		sc.close();
	}

}

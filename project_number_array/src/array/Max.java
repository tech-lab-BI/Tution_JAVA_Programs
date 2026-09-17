package array;

import adt.*;

public class Max {
	int arr[];
	Student stu[];
	Employee emp[];
	
	public Max(int arr[]) {
		this.arr = arr;
	}
	public Max(Student stu[]) {
		this.stu = stu;
	}
	public Max(Employee emp[]) {
		this.emp = emp;
	}
	public void display() {
		if(arr != null) {
			System.out.println("Array element : ");
			int l=arr.length;
			aseSort(arr);
			for(int i=0;i<l;i++) {
				System.out.print(arr[i]+" ");// need to be sort
			}
		} else if(stu != null) {
			System.out.println("Student Details : ");
			int l=stu.length;
			aseSort(stu);
			for(int i=0;i<l;i++) {
				System.out.print("Name : "+stu[i].name);// need to be sort
				System.out.print(", Roll : "+stu[i].roll);
				System.out.print(", Mark : "+stu[i].mark);
				System.out.println();
			}
		} else {
			System.out.println("Employee Details : ");
			int l=emp.length;
			aseSort(emp);
			for(int i=0;i<l;i++) {
				System.out.print("Name : "+emp[i].name);// need to be sort
				System.out.print(", Salary : "+emp[i].sal);
				System.out.print(", Company : "+emp[i].com);
				System.out.println();
			}
		}
	}
	public int getMax() {
		int m=0;
		if(arr != null) {
			m=arr[0];
			int l=arr.length;
			for(int i=1;i<l;i++) {
				if(m<arr[i])
					m = arr[i];
			}
		} else if(stu != null) {
			m=stu[0].mark;
			int l=stu.length;
			for(int i=1;i<l;i++) {
				if(m<stu[i].mark)
					m = stu[i].mark;
			}
		} else {
			m=emp[0].sal;
			int l=emp.length;
			for(int i=1;i<l;i++) {
				if(m<emp[i].sal)
					m = emp[i].sal;
			}
		}
		return m;
	}
	static void aseSort(int a[]) {
		int min;
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			min = i;
			for(int j=i+1;j<n;j++) {
				if(a[min] > a[j]) {
					min = j;
				}
			}
			if(min != i) {
				int t = a[min];
				a[min] = a[i];
				a[i] = t;
			}
		}
	}
	static void aseSort(Student a[]) {
		int min;
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			min = i;
			for(int j=i+1;j<n;j++) {
				if(a[min].mark > a[j].mark) {
					min = j;
				}
			}
			if(min != i) {
				Student t = a[min];
				a[min] = a[i];
				a[i] = t;
			}
		}
	}
	static void aseSort(Employee a[]) {
		int min;
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			min = i;
			for(int j=i+1;j<n;j++) {
				if(a[min].sal > a[j].sal) {
					min = j;
				}
			}
			if(min != i) {
				Employee t = a[min];
				a[min] = a[i];
				a[i] = t;
			}
		}
	}
}

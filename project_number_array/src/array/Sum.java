package array;

import adt.*;

public class Sum {
	int arr[];
	Student stu[];
	Employee emp[];
	
	public Sum(int arr[]) {
		this.arr = arr;
	}
	public Sum(Student stu[]) {
		this.stu = stu;
	}
	public Sum(Employee emp[]) {
		this.emp = emp;
	}
	public int getSum() {
		int s=0;
		if(arr != null) {
			int l=arr.length;
			for(int i=0;i<l;i++) {
				s+=arr[i];
			}
		} else if(stu != null) {
			int l=stu.length;
			for(int i=0;i<l;i++) {
				s+=stu[i].mark;
			}
		} else {
			int l=emp.length;
			for(int i=0;i<l;i++) {
				s+=emp[i].sal;
			}
		}
		return s;
	}
}

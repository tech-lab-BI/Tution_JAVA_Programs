package array;

import adt.*;

public class Min {
	int arr[];
	Student stu[];
	Employee emp[];
	
	public Min(int arr[]) {
		this.arr = arr;
	}
	public Min(Student stu[]) {
		this.stu = stu;
	}
	public Min(Employee emp[]) {
		this.emp = emp;
	}
	public int getMin() {
		int m=0;
		if(arr != null) {
			m=arr[0];
			int l=arr.length;
			for(int i=1;i<l;i++) {
				if(m>arr[i])
					m = arr[i];
			}
		} else if(stu != null) {
			m=stu[0].mark;
			int l=stu.length;
			for(int i=1;i<l;i++) {
				if(m>stu[i].mark)
					m = stu[i].mark;
			}
		} else {
			m=emp[0].sal;
			int l=emp.length;
			for(int i=1;i<l;i++) {
				if(m>emp[i].sal)
					m = emp[i].sal;
			}
		}
		return m;
	}
}

package lambda_expression_Questions;
import java.util.*;

interface Student{
	void display();
}

class StudentDetails{
	String name;
	int roll;
	int marks;
	StudentDetails(String name, int roll, int marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	Student getDetails() {
		Student ob = () -> {
			System.out.println("Name : "+name);
			System.out.println("Roll : "+roll);
			System.out.println("Marks : "+marks);
		};
		return ob;
	}
}

public class Main_Student {
	
	static void sortStu(StudentDetails ob[],int n){
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(ob[j].roll > ob[j+1].roll) {
					System.out.println(ob[j].roll+" : "+ob[j+1].roll);
					StudentDetails tem = ob[j];
					ob[j] = ob[j+1];
					ob[j+1] = tem;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int roll;
		int marks;
		System.out.print("Enter number of student : ");
		int n = sc.nextInt();
		StudentDetails stu[] = new StudentDetails[n];
		System.out.println("Enter student details : ");
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+"th details-------------");
			System.out.print("Name : ");sc.nextLine();
			name = sc.nextLine();
			System.out.print("Roll : ");
			roll = sc.nextInt();
			System.out.print("Mark : ");
			marks = sc.nextInt();
			stu[i] = new StudentDetails(name, roll, marks);
		}
		sortStu(stu, n);
		System.out.println("-----------sorted list----------");
		for(int i=0;i<n;i++) {
			Student ob = stu[i].getDetails();
			ob.display();
		}
		
		sc.close();
	}

}

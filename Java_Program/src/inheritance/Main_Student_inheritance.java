// Q15 - Create a class named Student having instance variables: name, HS, secondary, rank. Create a method show() which will display details of the student.
// Create a class named College having instance variables: type, fees, and an object of Student class. Create showDetails() which will print all details. Student class should be aggregated in College class.
// Create 3 child classes of College class named Govt, Semi-Govt, and Private. Create a method named admission() which will assign the type as Govt / Semi-Govt / Private and assign the fee structure as: Govt -> 60K, Semi-Govt -> 1.5L, Private -> 3.2L.
// Create a Main class and from main method take student details as user input and decide which college he/she can study as per criteria:
// - Govt: HS > 80%, Madhyamik > 80%, Rank < 3000
// - Semi-Govt: HS 70-79%, Madhyamik 70-79%, Rank 3000-6000
// - Private: HS 60-70%, Madhyamik 60-70%, Rank > 6000 (below 60% go for management quota).
// input  - Name: Rahul, HS: 85, Secondary: 82, Rank: 2500
// output - Name: Rahul, HS: 85.0%, Secondary: 82.0%, Rank: 2500, Eligible College: Govt, Fees: 60K

package inheritance;
import java.util.Scanner;

class Student{
	String name;
	int HS;//percentage
	int S;//percentage
	int rank;
	Student(String name, int HS, int S, int rank){
		this.name = name;
		this.HS = HS;
		this.S = S;
		this.rank = rank;
	}
	void show() {
		System.out.println("---STUDENT DETAILS---");
		System.out.println("Name: "+name+", HS : "+HS+", S : "+S+", Rank : "+rank);
	}
}
class College{
	int fees;
	String type;
	Student stu;
	void display() {
		stu.show();
		System.out.println("College Type : "+type+", Fess : "+fees);
	}
}
class Govt extends College{
	void admission(Student stu) {
		fees = 60000;
		type = "GOVT";
		this.stu = stu;
	}
}
class Semi_Govt extends College{
	void admission(Student stu) {
		fees = 150000;
		type = "SEMI-GOVT";
		this.stu = stu;
	}
}
class Private extends College{
	void admission(Student stu) {
		fees = 320000;
		type = "PRIVATE";
		this.stu = stu;
	}
}

public class Main_Student_inheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int HS;
		int S;
		int rank;
		System.out.println("--- Enter Student Details --- ");
		System.out.print("Name : ");
		name = sc.nextLine();
		System.out.print("HS percentage : ");
		HS = sc.nextInt();
		System.out.print("Maddhamik percentage : ");
		S = sc.nextInt();
		System.out.print("Rank : ");
		rank = sc.nextInt();
		Student stu = new Student(name, HS, S, rank);
		
		if(HS >= 80 && S >= 80 && rank < 3000) {
			Govt gs = new Govt();
			gs.admission(stu);
			gs.display();
		}
		else if(HS >= 70 && S >= 70 && rank < 6000) {
			Semi_Govt ss = new Semi_Govt();
			ss.admission(stu);
			ss.display();
		}
		else if(HS > 60 && S > 60) {
			Private ps = new Private();
			ps.admission(stu);
			ps.display();
		}
		else {
			System.out.println("You are Brillient , Go for management quota");
		}
	}

}

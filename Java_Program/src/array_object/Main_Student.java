//question - Create a class named Student having instance variable roll, 
//name and reference of Marks class. Create a method named display(),
//which will display the student's name, roll and marks in each subject in a single line. 
//Create a class named Marks having instance variable phy, che, math. 
//Create a method named total() that will return the total marks. 
//This Marks class should be aggregated to above Student class. 
//Create Main class and from main() take number of student details as user 
//input and compute the below operations in separate 
//methods: 1. void maxMark(Student[]) - this method will print the student 
//name who got maximum in phy, che, math. 2. void max(Student[]) - this method will
//print the student details who is having maximum total marks. 
//3. void gradeStudent(Student[]) - this method will show the grades and percentage 
//of every student according to total marks. 
//90-100 -> O, 80-89 -> E, 65-79 -> A, 50-64 -> B, 40-49 -> C, 0-39 -> Fail. 
//Print in Name Grade format.
//input - 1 Amit 101 95 85 90
//output - Name: Amit, Roll: 101, Phy: 95, Che: 85, Math: 90, Total: 270, Grade: O

package array_object;

import java.util.Scanner;

class Student {
    String name;
    int roll;
    Marks mark;

    void display() {
        System.out.print("Name : "+name+", Roll : "+roll);
        System.out.println("Marks : [Phy- "+mark.phy+", Che- "+mark.che+", Math- "+mark.math+"]");
    }
}

class Marks {
    double phy;
    double che;
    double math;

    double total() {
        return (phy + che + math);
    }
}

public class Main_Student {

    static void maxMark(Student s[]) {

        Student p = s[0], c = s[0], m = s[0];

        for (int i = 1; i < s.length; i++) {

            if (s[i].mark.phy > p.mark.phy)
                p = s[i];

            if (s[i].mark.che > c.mark.che)
                c = s[i];

            if (s[i].mark.math > m.mark.math)
                m = s[i];
        }

        System.out.println("\nMaximum Marks:");

        System.out.println("Physics : " + p.mark.phy + " ,name " + p.name);
        System.out.println("Chemistry : " + c.mark.che + " ,name " + c.name);
        System.out.println("Math : " + m.mark.math + " ,name " + m.name);
    }
    
    static void maxTotal(Student s[]) {
    	Student tem=s[0];
    	double maxTotal = s[0].mark.total();
    	for(int i=1;i<s.length;i++) {
    		double t = s[i].mark.total();
    		if(maxTotal < t) {
    			tem = s[i];
    			maxTotal = t;
    		}
    	}
    	System.out.println("Highest total mark = "+maxTotal);
    	tem.display();
    }

    static void gradeStudent(Student s[]) {
    	System.out.println("Name\tGrade\tPercentage");
    	for(int i=0;i<s.length;i++) {
    		double avg = (s[i].mark.total()/3.0);
    		char grade;
    		if(avg >= 90.0)
    			grade='O';
    		else if(avg >= 80.0)
    			grade='E';
    		else if(avg >= 65.0)
    			grade='A';
    		else if(avg >= 50)
    			grade='B';
    		else if(avg >= 40)
    			grade='C';
    		else
    			grade='F';
    		System.out.println(s[i].name+"\t"+grade+"\t"+(int)avg+"%");
    	}
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student s[] = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
        }

        System.out.println("Enter student details:");
        for (int i = 0; i < n; i++) {

        	Marks ob = new Marks();
        	s[i].mark = ob;
        	
            System.out.print("Name: ");
            s[i].name = sc.nextLine();

            System.out.print("Roll: ");
            s[i].roll = sc.nextInt();

            System.out.print("Enter 3sub marks: ");
            s[i].mark.phy = sc.nextDouble();
            s[i].mark.che = sc.nextDouble();
            s[i].mark.math = sc.nextDouble();

            sc.nextLine();
        }

        System.out.print("---------------------------------------");
        maxMark(s);
        System.out.println("---------------------------------------");
        maxTotal(s);
        System.out.println("---------------------------------------");
        gradeStudent(s);
        System.out.println("---------------------------------------");

        sc.close();
    }
}
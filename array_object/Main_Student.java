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
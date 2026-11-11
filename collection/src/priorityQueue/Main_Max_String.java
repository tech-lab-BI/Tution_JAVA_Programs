//WAP to take 'n' number of string input as user input. 
//Delete the string which was having max length. 
//Also print the string. 

package priorityQueue;

import java.util.*;

class MyComp implements Comparator<String>{
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length())
			return 1;
		else if(o1.length() > o2.length())
			return -1;
		else
			return 0;
	}
}

public class Main_Max_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<String> p = new PriorityQueue<String>(new MyComp());
		System.out.print("Enter string :: ");
		String str = sc.nextLine();
		String s[] = str.split(" ");
		for(String sub : s) {
			p.add(sub);
		}
		System.out.println(p.poll());
	}

}

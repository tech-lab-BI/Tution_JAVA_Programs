//43. Create a class named Data having the following instance variable:
//
//- datalist (ArrayList<Integer>)
//
//Create a parameterized constructor.
//
//From the Main class, take n number of data as user input through a LinkedList.
//
//The query will be taken as (x, y) from the user input, and find the corresponding data.
//
//No. of data lists = 5
//
//Input:
//5
//42 31 24 27 3 9
//16 32 34 8
//3 6
//43 48 49 50
//7
//
//Output:
//Enter Query:
//(1, 5) -> 27
//(4, 2) -> 48
//(3, 3) -> ERROR
//(5, 2) -> ERROR

package arraylist;

import java.util.*;

class MiscException extends Exception{
	MiscException(String s){
		super(s);
	}
}

class Data{
	ArrayList<Integer> al;
	Data(String s){
		String str[] = s.split(" ");
		al = new ArrayList<Integer>();
		for(int i=0;i<str.length;i++) {
			al.add(Integer.parseInt(str[i]));
		}
	}
}

public class Data_Main {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("No of data :: ");
		int n = sc.nextInt();sc.nextLine();
		LinkedList<Data> d = new LinkedList<Data>();
		for(int i=0;i<n;i++) {
			System.out.print("Type :: ");
			s = sc.nextLine();
			d.add(new Data(s));
		}
		while(true) {
			System.out.print("Enter Quary :: ");
			s = sc.nextLine();
			try {
				int li = Integer.parseInt(s.charAt(1)+"")-1;
				int ai = Integer.parseInt(s.charAt(3)+"")-1;
//				System.out.println(li+" "+ai);
//				System.out.println(n+" "+d.get(li).al.size());
				if(li > n && (d.get(li).al.size() > ai)) {
					throw new MiscException("ERROR");
				}
				System.out.println(d.get(li).al.get(ai));
			} catch (MiscException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("<Invalid Quary>");
			}
		}
	}

}

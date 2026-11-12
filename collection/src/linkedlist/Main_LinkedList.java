//42. WAP to create a Linked List containing some integers. 
//Perform the following basic operations as per the given queries:
//
//Operations:
//insert, insertfirst, insertlast, delete, deletefirst, deletelast, exit
//
//Input:
//12 0 1 78 24
//
//No. of queries: 7
//
//Queries:
//1. insertfirst 27
//2. insert value 2 (Invalid Query)
//3. insertlast 33
//4. insert 30 34
//5. deletefirst
//6. deletelast
//7. delete 1
//8. delete 10 (Value not present in Linked List)
//9. insert 34 3 (Index out of bounds)
//
//Output:
//Display the Linked List after performing the given operations and display appropriate error messages for invalid queries, values not present, and out-of-bounds indices.

package linkedlist;

import java.util.*;

class MiscException extends Exception{
	MiscException(String s){
		super(s);
	}
}

public class Main_LinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		
		System.out.print("Enter input list :: ");
//		String s = sc.nextLine();
		String s = "12 0 1 78 24";
		String str[] = s.split(" ");
		for(String sub : str){
			ll.addLast(Integer.parseInt(sub));
		}
		while(true) {
			System.out.print("\nEnter quary :: ");
			s = sc.nextLine();
			try {
				str = s.split(" ");
				if(str[0].equalsIgnoreCase("insert") && str.length == 3) {
					int ind = Integer.parseInt(str[1]);
					int val = Integer.parseInt(str[2]);
					if(ind > ll.size()-1) {
						throw new MiscException("Index out of bound");
					}
					ll.add(ind, val);
				} else if(str[0].equalsIgnoreCase("insertfirst") && str.length == 2) {
					int val = Integer.parseInt(str[1]);
					ll.addFirst(val);
				} else if(str[0].equalsIgnoreCase("insertlast") && str.length == 2) {
					int val = Integer.parseInt(str[1]);
					ll.addLast(val);
				} else if(str[0].equalsIgnoreCase("delete") && str.length == 2) {
					int val = Integer.parseInt(str[1]);
					if(ll.indexOf(val)==-1) {
						throw new MiscException("Value not present");
					}
					ll.remove(ll.indexOf(val));
				} else if(str[0].equalsIgnoreCase("deletefirst") && str.length == 1) {
					ll.poll();
				} else if(str[0].equalsIgnoreCase("deletelast") && str.length == 1) {
					ll.pollLast();
				} else if(str[0].equalsIgnoreCase("exit")) {
					System.exit(0);
				} else {
					throw new MiscException("<Invalid Quary>");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				Iterator<Integer> it = ll.iterator();
				while(it.hasNext()) {
					System.out.print(it.next()+" ");
				}
			}
		}
	}

}

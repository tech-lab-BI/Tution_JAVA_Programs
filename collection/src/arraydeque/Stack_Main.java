//44. Create a class named StackData having the following instance variables:
//
//- stack (datatype: ArrayDeque<Integer>)
//- top (datatype: integer)
//
//Create the following methods:
//- push(int)
//- pop()
//- isEmpty()
//- peek()
//- display()
//
//Perform the above operations using ArrayDeque.
//
//Display the top position also.
//
//Create a Main class. From the main() method, take n number of data as user input through a single line as a string.
//
//Call the above methods to perform the stack operations.

package arraydeque;
import  java.util.*;
class StackData{
	ArrayDeque<Integer> ad;
	int top;
	StackData(String s){
		ad = new ArrayDeque<Integer>();
		top=-1;
		String str[] = s.split(" ");
		for(String sub : str) {
			push(Integer.parseInt(sub));
		}
	}
	boolean isEmpty() {
		return ad.isEmpty();
	}
	void push(int x) {
		ad.add(x);
		top++;
	}
	int pop() {
		if(!isEmpty()) {
			top--;
			return ad.poll();
		}
		System.out.println("Stack Underflow");
		return -99999;
	}
	int peek() {
		if(!isEmpty()) {
			return ad.peek();
		}
		System.out.println("Stack Underflow");
		return -99999;
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Stack Empty");
			return;
		}
		Iterator<Integer> it = ad.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("    ||  Top :: "+top);
	}
}
public class Stack_Main {

	public static void main(String[] args) {
		int ch,val;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter initial values :: ");
		String s = sc.nextLine();
		StackData sd = new StackData(s);
		while(true) {
			System.out.println("----------");
			System.out.println("1. push 2. pop 3. isEmpty 4. peek 5. display 6. exit");
			ch = sc.nextInt();
			System.out.println("-----------");
			switch(ch) {
			case 1:
				System.out.print("enter value :: ");
				val = sc.nextInt();
				sd.push(val);
				break;
			case 2:
				val = sd.pop();
				if(val!=-99999) {
					System.out.println(val);
				}
				break;
			case 3:
				sd.isEmpty();
				break;
			case 4:
				sd.peek();
				break;
			case 5:
				sd.display();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Wrong chioce");
			}
		}
	}

}

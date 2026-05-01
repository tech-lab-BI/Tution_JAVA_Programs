package java_contructor;
import java.util.Scanner;

class Book{
	String name;
	String auther;
	double price;
	Book(String t_name, String t_aut, double t_price){
		name = t_name;
		auther = t_aut;
		price = t_price;
	}
	void show() {
		System.out.println("Book Name = "+name+" | Auther = "+auther+" | Price = "+price);
	}
}
public class Main_Book {

	static void showByAuther(Book a[],String aut_name) {
		boolean flag = true;
		for(int i=0;i<a.length;i++) {
			if(a[i].auther.equalsIgnoreCase(aut_name)) {
				a[i].show();
				flag = false;
			}
		}
		if(flag)
			System.out.println("No details found of \""+aut_name+"\"");
	}
	
	static Book maxPrice(Book a[]) {
		Book max_price=a[0];
		for(int i=1;i<a.length;i++) {
			if(max_price.price < a[i].price) {
				max_price = a[i];
			}
		}
		return max_price;
	}
	static void bookByPriceAsc(Book a[]) {
	    int n = a.length;

	    for (int i = 0; i < n - 1; ++i) {
	        int min_idx = i;

	        for (int j = i + 1; j < n; ++j) {
	            if (a[j].price < a[min_idx].price) {
	                min_idx = j; 
	            }
	        }
	        Book tem = a[i];
	        a[i] = a[min_idx];
	        a[min_idx] = tem;
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String auther;
		double price;
		
		System.out.print("Enter number of Books :: ");
		int n = sc.nextInt();sc.nextLine();
		Book books[] = new Book[n];
		for(int i=0;i<n;i++) {
			System.out.println("--------------"+(i+1)+"th Book details-----------------");
			System.out.print("Enter Book name -> ");
			name = sc.nextLine();
			System.out.print("Enter Auther name -> ");
			auther = sc.nextLine();
			System.out.print("Enter Book price -> ");
			price = sc.nextDouble();sc.nextLine();
			books[i] = new Book(name, auther, price);
		}
		
		System.out.println("\n----------Search by auther name----------------");
		System.out.print("Enter auther name -> ");
		name = sc.nextLine();
		showByAuther(books, name);
		
		System.out.println("\n----------Max Price Book details----------------");
		Book mp = maxPrice(books);
		mp.show();
		
		bookByPriceAsc(books);
		System.out.println("\n----------Sorted by price----------------");
		for(int i=0;i<n;i++) {
			books[i].show();
		}
	}

}

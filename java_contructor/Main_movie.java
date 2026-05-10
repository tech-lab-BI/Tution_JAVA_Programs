package java_contructor;

import java.util.Scanner;

class Movie{
	String id;
	String name;
	String directorName;
	int budget;
	String releaseDate;
	Movie(String n, String d,int b,String r){
		String n2 = n.substring(0,2);
		String dd = r.substring(0, 2), mm = r.substring(3, 5), yy = r.substring(6);
		id = n2+dd+mm+yy;
		name = n;
		directorName = d;
		budget = b;
		releaseDate = r;
	}
	void details() {
		System.out.print("ID:"+id+" | Name::"+name+" | Director Name:"+directorName+" | Budget:"+budget+" | Release Date:"+releaseDate);
		System.out.println();
	}
}
public class Main_movie {
	
	public static void movieDetails(Movie m[]) {
		int n = m.length;
		for (int i = 0; i < n - 1; ++i) {
	        int min_idx = i;

	        for (int j = i + 1; j < n; ++j) {
	            if (m[j].budget < m[min_idx].budget) {
	                min_idx = j; 
	            }
	        }
	        Movie tem = m[i];
	        m[i] = m[min_idx];
	        m[min_idx] = tem;
	    }
		for(int i=0;i<n;i++) {
			m[i].details();
		}
	}
	public static Movie maxBudget(Movie m[]) {
		int n = m.length;
		Movie md = m[0];
		for(int i=1;i<n;i++) {
			if(md.budget < m[i].budget) {
				md = m[i];
			}
		}
		return md;
	}
	public static void movieBy_year(Movie m[],String year) {
		int n = m.length,f=0;
		for(int i=0;i<n;i++) {
			if(m[i].releaseDate.substring(6).equals(year)) {
				m[i].details();
				f=1;
			}
		}
		if(f==0) {
			System.out.println("NO movie found !!!");
		}
	}
	public static void showA(Movie m[], char x) {
		int n = m.length,f=0,g=0;
		System.out.println("-----MATCH BY NAME--------");
		for(int i=0;i<n;i++) {
			if(m[i].name.charAt(0) == x) {
				m[i].details();
				if(f==0)f=1;
			}
		}
		if(f==0) {
			System.out.println("NO movie found in NAME !!!!!");
		}
		System.out.println("---------MATCH DIRECTOR NAME---------");
		for(int i=0;i<n;i++) {
			if(m[i].directorName.charAt(0) == x) {
				m[i].details();
				if(g==0)g=1;
			}
		}
		if(g==0) {
			System.out.println("NO movie found in Director name !!!!!");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of movie :: ");
		int n = sc.nextInt();sc.nextLine();
		Movie m[] = new Movie[n];
		System.out.print("\n--------------------INPUT MOVIE DETAILS---------------------");
		for(int i=0;i<n;i++) {
			
			System.out.println("----"+(i+1)+"th movie details---- ");
			System.out.print("Movie name >> ");
			String na = sc.nextLine();
			System.out.print("Director name >> ");
			String d = sc.nextLine();
			System.out.print("Movie Budget >> ");
			int b = sc.nextInt();sc.nextLine();
			System.out.print("Release Date >> ");
			String r = sc.nextLine();
			
			m[i] = new Movie(na, d, b, r);
//			System.out.println("------------------------");
		}
//		System.out.println("-----------------------MOVIE DETAILS------------------------");
//		for(int i=0;i<n;i++) {
//			m[i].details();
//		}
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("++++++++++++++++++++++++++++SORTED MOVIE LIST+++++++++++++++++++++++++");
		movieDetails(m);
		System.out.println("++++++++++++++++++++++++MAX BUDGET MOVIE++++++++++++++++++++++++++++++");
		Movie maxB = maxBudget(m);
		maxB.details();
		System.out.println("+++++++++++++++++++++SEARCH BY YEAR++++++++++++++++++++++++++");
		System.out.print("Enter search year :: ");
		String y = sc.nextLine();
		movieBy_year(m,y);
		System.out.println("++++++++++++++++++++SEARCH BY CHAR++++++++++++++++++++++++++");
		System.out.print("Enter search Char :: ");
		char x = sc.next().charAt(0);
		showA(m, x);
	}
}

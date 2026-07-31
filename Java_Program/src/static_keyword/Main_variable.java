package static_keyword;
import java.util.*;


class Variable{
	static double num;
	static String str;
	Variable(double n){
		num = n;
	}
	Variable(String s){
		str = s;
	}
	static class Number{
		static void isEven(int x) {
			if(x%2==0)
				System.out.println(x+" is Even");
			else
				System.out.println(x+" is Odd");
		}
		static void isPrime(int x) {
			for(int i=2;i<x/2;i++) {
				if(x%i==0) {
					System.out.println(x+" is Not Prime");
					return;
				}		
			}
			System.out.println(x+" is Prime");
		}
		static int fact(int x) {
			int r=1;
			for(int i=2;i<=x;i++) {
				r *= i;
			}
			return r;
		}
		static void isStrong(int n) {
			int x=n;
			int s=0;
			while(x>0) {
				s += fact(x%10);
				x /= 10;
			}
			if(s==n)
				System.out.println(n+" is Strong");
			else
				System.out.println(n+" is not Strong");
		}
		static void isPerfect(int n) {
			int x=n;
			int s=0;
			while(x>0) {
				s += (x%10);
				x /= 10;
			}
			if(s==n)
				System.out.println(n+" is Perfect");
			else
				System.out.println(n+" is not Perfect");
		}
		void show() {
			if(!(num == ((double)((int)num)))) { // check double
				System.out.println(num + " is actual double");
			}else {
				int x = (int)num;
				isEven(x);
				isPrime(x);
				isStrong(x);
				isPerfect(x);
			}
		}
		static void isPalindrom() {
			int i=0;
			int l=str.length();
			while(i < l && str.charAt(i) == str.charAt(l-i-1)) {
				i++;
			}
			
			if(i==l) {
				System.out.println(str+" is Palindrom");
			}else {
				System.out.println(str+" is notPalindrom");
			}
		}
		static void count() {
			int i=0,v=0,c=0;
			while(i<str.length()) {
				char ch = str.charAt(i);
				switch(ch) {
				 case 'a':
				 case 'e':
				 case 'i':
				 case 'o':
				 case 'u':
				 case 'A':
				 case 'E':
				 case 'O':
				 case 'U':
					 v++;
					 break;
				 case ' ':
					 break;
				 default:
					c++;
				}
				i++;
			}
			System.out.println(str+" length = "+str.length());
			System.out.println("Vowel count = "+v);
			System.out.println("Consosnet count = "+c);
		}
		void check() {
			isPalindrom();
			count();
		}
	}
}


public class Main_variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Variable.Number ob = new Variable.Number();
		
		System.out.print("Enter double : ");
		double d = sc.nextDouble();sc.nextLine();
		Variable ob1 = new Variable(d);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		Variable ob2 = new Variable(s);
		
		System.out.println("-------------NUMBER------------");
		ob.show();
		System.out.println("-------------STRING------------");
		ob.check();
	}

}

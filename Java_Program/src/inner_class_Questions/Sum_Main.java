package inner_class_Questions;
import java.util.Scanner;

interface Sum {
	int addNumber(int a, int b);
	int addArray(int a[]);
	int addChar(char a, char b);
}

class Calculation {
	Sum getResult() {
		Sum ob = new Sum() {
			public int addNumber(int a,int b) {
				return a+b;
			}
			public int addArray(int a[]) {
				int s=0;
				for(int i=0;i<a.length;i++) {
					s+=a[i];
				}
				return s;
			}
			public int addChar(char a, char b) {
				if((a>='0' && a<='9') && (b>='0'&&b<='9')) {
					return (a-'0' + b-'0');
				} else {
					System.out.println("given input is not number!!");
					return -1;
				}
			}
		};
		return ob;
	}
}

public class Sum_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,n;
		char x,y;
		Sum c = new Calculation().getResult();
		
		System.out.print("Enter 2 number : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Result 1 : "+c.addNumber(a, b));
		
		System.out.print("Enter size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter array element : ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Result 2 : "+c.addArray(arr));
		
		System.out.print("Enter 2 Char : ");
		x = sc.next().charAt(0);
		y = sc.next().charAt(0);
		System.out.println("Result 3 : "+c.addChar(x, y));
	}

}

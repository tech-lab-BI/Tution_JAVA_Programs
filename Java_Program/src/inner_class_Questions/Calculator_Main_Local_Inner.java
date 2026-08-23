package inner_class_Questions;
import java.util.*;

class Calculator{
	double result;
	void calculation(double a, double b, char c) {
		class Sum {
			void getResult(double a, double b) {
				result = a+b;
				System.out.println(a+" + "+b+" = "+result);
			}
		}
		class Sub {
			void getResult(double a, double b) {
				result = a-b;
				System.out.println(a+" - "+b+" = "+result);
			}
		}
		class Mul {
			void getResult(double a, double b) {
				result = a*b;
				System.out.println(a+" * "+b+" = "+result);
			}
		}
		class Div {
			void getResult(double a, double b) {
				if(b!=0) {
					result = a/b;
					System.out.println(a+" / "+b+" = "+result);
				} else {
					System.out.println("Denominator cann't be zero.");
				}
			}
		}
		switch(c) {
			case '+' :
				Sum ob1 = new Sum();
				ob1.getResult(a,b);
				break;
			case '-' :
				Sub ob2 = new Sub();
				ob2.getResult(a,b);
				break;
			case '*' :
				Mul ob3 = new Mul();
				ob3.getResult(a,b);
				break;
			case '/' :
				Div ob4 = new Div();
				ob4.getResult(a,b);
				break;
			default :
				System.out.println("invalid operator.");
		}
	}
}

public class Calculator_Main_Local_Inner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y;
		char z;
		Calculator s = new Calculator();
		
		System.out.print("Enter operands : ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		System.out.print("Enter operator : ");
		z = sc.next().charAt(0);
		
		s.calculation(x, y, z);
	}

}

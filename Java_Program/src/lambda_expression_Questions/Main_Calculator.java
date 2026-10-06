// Q27 - Create 4 functional interfaces named Add, Sub, Div, Mul, each interface having one abstract method.
// Create a class Calculators having two instance variables num1 & num2. Create a constructor to initialize those variables.
// Create a method calculate() which will calculate all calculator operations using lambda expressions, store the results in an integer array, and return it.
// Create Main class and from main() take 2 integers as user input, find their calculated results, and print them.
// input  - Numbers: 20 5
// output - Addition: 25, Subtraction: 15, Division: 4, Multiplication: 100

package lambda_expression_Questions;
import java.util.*;

interface Add{
	int add();
}
interface Sub{
	int sub();
}
interface Div{
	int div();
}
interface Mul{
	int mul();
}

class Calculator{
	int num1,num2;
	Calculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	int[] calculate() {
		int result[] = new int[4];
		Add a = () ->  (num1+num2);
		result[0] = a.add();
		Sub s = () ->  (num1-num2);
		result[1] = s.sub();
		Div d = () ->  (num1/num2);
		result[2] = d.div();
		Mul m = () ->  (num1*num2);
		result[3] = m.mul();
		return result;
	}
}

public class Main_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two number : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int res[] = new Calculator(x, y).calculate();
		
		System.out.println("Add : "+res[0]);
		System.out.println("Sub : "+res[1]);
		System.out.println("Div : "+res[2]);
		System.out.println("Mul : "+res[3]);
		sc.close();
	}

}

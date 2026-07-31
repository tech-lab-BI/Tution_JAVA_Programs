package class_and_objects;

class A
{
	int x;
	char c;
	void show()
	{
		System.out.println("X = "+x+" c= "+c);
	}
	void display()
	{
		System.out.println("Display in A");
	}
}

public class Main_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		ob.display();
		ob.show();
		ob.x=25;
		ob.show();
		System.out.println("Value is :: "+ob.x);
	}

}

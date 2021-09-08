package Java;

public class task2 {
	static int i=10;
	static
	{
		display();
		System.out.println("First static block"+i);
	}
	task2()
	{
		System.out.println("This is static flow");
	}

	public static void main(String[] args) {
		display();
		System.out.println("main method");

	}
	static void display()
	{
		System.out.println("this is display method");
	}
	static int j=20;
	static
	{
		
		new task2();
		System.out.println("second static block"+j);
	}
	//static int j=20;

}

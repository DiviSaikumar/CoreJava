package Java;

public class Demo9 {
	void display()
	{
		System.out.println("hello world");
	}
	protected void finalize()
	{
		System.out.println("garbage has been collected");
	}
	public static void main(String[] args) {
		Demo9 obj1=new Demo9();
		Demo9 obj2=new Demo9();
		obj1.display();
		
		obj1=null;
		//obj1.display();
		
		System.gc();
		obj2.display();

	}

}

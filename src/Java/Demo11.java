package Java;

public class Demo11 {
	int a=10;//instance variable
	static int b=20;//static variable
	void meth1()
	{
		int c=70;//local variable
		System.out.println("local variable"+c);
		Demo11 obj=new Demo11();
		System.out.println("local variable"+new Demo11().a);
		obj.meth3();
	}
	void meth2() {
		System.out.println("instance variable"+a);
		System.out.println("static variable"+b);
	/*	System.out.println("local variable"+c);
	 *  local variable cannot be accessed outside the method*/
		new Demo11().meth1();
	}
	void meth3()
	{
		//Demo11 obj=new Demo11();
		int b=10;//local variable
		System.out.println("instance variable=="+a);
		System.out.println("static variable=="+Demo11.b);
		//System.out.println("static variable=="+obj.b);
		System.out.println("local variable===="+b);
		
	}
	public static void main(String[] args) {
		Demo11 obj=new Demo11();
		obj.meth2();

	}

}

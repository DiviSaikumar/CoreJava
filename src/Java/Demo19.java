//Static accessing methods 
package Java;

public class Demo19 {
	int a=10;
	static int b=10;
	
	void meth1()
	{
		System.out.println("this is instance method");
		System.out.println("instance variable"+a);
		System.out.println("static variable"+b);
	}
	static void meth2()
	{
		System.out.println("this si static method");
		System.out.println("instance variable"+new Demo19().a);
		System.out.println(("static variable"+b));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo19 obj=new Demo19();
		obj.meth1();
		System.out.println("=================");
		Demo19.meth2();
		new Demo19().meth2();
		meth2();
	}

}

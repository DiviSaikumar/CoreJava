package Java;

public class Demo1 
{
	void meth1()
	{
		Demo1 obj=new Demo1();
		obj.meth5();
		int a=10;
		System.out.println(10);
		System.out.println(54+a);
	}
	void meth2()
	{
		int a=20;
		System.out.println(78-a);
	}
	void meth3()
	{
		Demo1 obj=new Demo1();
		System.out.println(89+1);
		obj.meth1();
		System.out.println(10);
	}
	void meth4()
	{
		System.out.println(89);
		System.out.println(85);
		System.out.println(44);
	}
	void meth5()
	{
		System.out.println(77);
		Demo1 obj=new Demo1();
		obj.meth2();
		System.out.println(99);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo1 obj=new Demo1();
		obj.meth3();
		System.out.println("End");
	}
}

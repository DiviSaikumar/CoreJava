package Java;

public class Demo7 {
	void meth1()
	{
		System.out.println(10);
		System.out.println(64);
		System.out.println("End");
	}
	int meth2(int a,int b,int c)
	{
		System.out.println(a);
		Demo7 obj=new Demo7();
		String s=obj.meth5(100,"java is awesome");
		System.out.println(s);
		return a-b;
	}
	String meth3(String s,int b,int d)
	{
		System.out.println(b+d);
		return s;
	}
	int meth4(int c,int k)
	{
		System.out.println(k);
		Demo7 obj=new Demo7();
		int result=obj.meth2(50, 50, 50);
		System.out.println(result);
		return k+10;
	}
	String meth5(int a,String l)
	{
		System.out.println(a+a);
		Demo7 obj=new Demo7();
		String s=obj.meth3("hi", 15, 10);
		System.out.println(s);
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 obj=new Demo7();
		System.out.println("Start");
		int result=obj.meth4(20, 10);
		System.out.println(result);
		obj.meth1();
	}

}

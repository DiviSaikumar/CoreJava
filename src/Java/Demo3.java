package Java;

public class Demo3 {
	void meth1(int a,int b)
	{
		System.out.println(a+b);
	}
	void meth2(int a)
	{
		System.out.println(85+a);
	}
	void meth3(String s)
	{
		System.out.println(s);
		Demo3 obj=new Demo3();
		obj.meth2(50);
		obj.meth1(10,20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		Demo3 obj=new Demo3();
		obj.meth3("Java is awesome");
	}

}

package Java;

public class Demo2 {
	void meth1(int a)
	{
		System.out.println("meth1 called");
	}
	void meth2(int a,int b)
	{
		System.out.println("meth2 called");
	}
	void meth3(String s,int a,int b)
	{
		System.out.println("meth3 called");
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 obj=new Demo2();
		obj.meth1(50);
		obj.meth3("java", 50,85);
	}

}

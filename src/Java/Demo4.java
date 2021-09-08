package Java;

public class Demo4 {
	void meth1()
	{
		System.out.println("meth1 called");
	}
	int meth2(int a,int b)
	{
		System.out.println("meth2 called");
		return a+10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 obj=new Demo4();
		int x=10;
		int y=obj.meth2(10,20);
		System.out.println(x+y);
		obj.meth1();
	}

}

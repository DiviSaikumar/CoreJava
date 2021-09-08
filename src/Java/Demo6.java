package Java;

public class Demo6 {
	int meth1()
	{
		System.out.println(10);
		return 100;
	}
	String meth2()
	{
		System.out.println(50);
		return "java";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 obj=new Demo6();
		obj.meth1();
		obj.meth2();
		System.out.println(obj.meth2());
	}

}

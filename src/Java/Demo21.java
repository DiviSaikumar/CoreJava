package Java;

public class Demo21 
{
	void implicit()
	{
		byte b=10;
				System.out.println("byte value is "+b);
		short s=b;
		System.out.println("short value is "+s);
		s++;
		int i=s++;
		System.out.println("int value is "+i);
		System.out.println("short value is "+s);
		long l=i;
		System.out.println("long value is "+(--l));
		float f=l;
		System.out.println("value of flot is"+(f+b));
		double d=(--f);
		System.out.println("the value of double is "+d);
		show();
		{
			if(!(d==f))
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
		}
	}	
	
	public static void main(String[] args) 
	{
		Demo21 obj=new Demo21();
		obj.implicit();
		
		
	}
	static void show()
	{
		char c='A';
		int a=++c;
		System.out.println(a);
		Demo21 obj=new Demo21();
		String s=obj.meth1();
		System.out.println(s);
	}
	String meth1()
	{
		String s="implicit casting is done by the compiler automatically";
				return s;
	}
}

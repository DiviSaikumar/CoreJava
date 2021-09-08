package Java;

public class Demo20 {
	void meth1()
	{
		System.out.println("--implicit typecasting-----");
		//smaller===>larger
		byte b1=50;
		int i1=b1;
		System.out.println("byte value===>"+b1);
		System.out.println("int value===>"+i1);
		char c='a';
		int i2=c;
		float f1=c;
		System.out.println("char value===>"+c);
		System.out.println("int value===>"+i2);
		System.out.println(("float value===>"+f1));
	}
	void meth2()
	{
		System.out.println("----explicit typecasting----");
		int i1=50;
		byte b1=(byte)i1;
		int i2=500;
		//[MinimumRange + (Result-maximumRange - 1)]
		//-128+(500-128)---> -128+(372)---> 244
		//-128+(244-128)---> -128+116 ---> -12
		byte b2=(byte)i2;
		float f=10.9999f;
		byte b3=(byte)f;
		
		System.out.println("int value===>"+i1);
		System.out.println("byte value b1===>"+b1);
		System.out.println("byte value b2===>"+b2);
		System.out.println("byte value b3===>"+b3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo20 obj=new Demo20();
obj.meth1();
obj.meth2();
	}

}

package Java;

public class Demo10 {
	int i;
	char c;
	float f;
	byte b;
	short s;
	double d;
	long l;
	void display()
	{
		System.out.println("int value===>"+i);
		System.out.println("byte value===>"+b);
		System.out.println("short value===>"+s);
		System.out.println("float value===>"+f);
		System.out.println("double value"+d);
		System.out.println("char value===>"+c);
		System.out.println("long value===>"+l);
		int i1=10;
		int i2=20;
		int i3=i1+i2;
		System.out.println("addition===>"+i3);
		System.out.println("================");
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
		System.out.println("==================");
		float f1=10.3f;
		System.out.println(f1);
		long l1=1234567l;
		System.out.println(l1);
	}
	public static void main(String[] args) {
		Demo10 obj=new Demo10();
		obj.display();

	}

}

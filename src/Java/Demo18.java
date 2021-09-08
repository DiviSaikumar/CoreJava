package Java;

public class Demo18 {
	int a;
	static int b;
	Demo18()
	{
		a++;
		System.out.println("count==>"+a);
		System.out.println("================");
		b++;
		System.out.println("Static variable count==>"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo18();
		new Demo18();
		new Demo18();
	}

}

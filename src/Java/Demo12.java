//Demo on constructor understanding
package Java;

public class Demo12 {
	Demo12()
	{
		System.out.println("Demo12 non parameterized method is called");
		new Demo12("java is awesome");
	}
	Demo12(String s)
	{
		System.out.println("Demo12 parameterized method is called");
	}
	void meth1()
	{
		System.out.println("Demo12 method is called");
	}
	public static void main(String[] args) {
		Demo12 obj=new Demo12();
		obj.meth1();

	}

}

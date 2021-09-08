package Java;

public class Demo13 {
	public Demo13()
	{
		System.out.println("sunday");
		Demo13 obj=new Demo13(10);
		System.out.println("tuesday");
		String s=obj.display("challange accepted");
		System.out.println(s);
	}
	public Demo13(int temp)
	{
		System.out.println("saturday");
		new Demo13(10,12);
		System.out.println("monday");
	}
	String display(String s)
	{
		System.out.println("in the next statement i am returning string value");
		return s;
	}
	public Demo13(int data, int temp)
	{
		System.out.println("thursday");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo13();
		System.out.println(("output verified"));
	}

}

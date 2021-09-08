package Java;

public class task8 {
	static int a=0;
	int b=0;
	task8()
	{
		a++;
		b++;
		System.out.println("static variable==>"+a);
		System.out.println("instance variable==>"+b);
		System.out.println("--------");
	}
	void display()
	{
		System.out.println("******accessing static variable*****");
		System.out.println(task8.a);
		System.out.println(a);
		System.out.println(new task8().a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new task8();
		new task8();
		new task8();
		System.out.println("################");
		new task8().display();
	}

}

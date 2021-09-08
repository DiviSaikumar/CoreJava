package Java;

public class task7 {
	static int x=m1();
	
	public static void main(String[] args) {
		System.out.println(task7.x);
	}
	static
	{
		System.out.println(x);
		task7.x=x+20;
	}
	static int m1()
	{
		task7.x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(task7.x);
		return 100;
	}
}

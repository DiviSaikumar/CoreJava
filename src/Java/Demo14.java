package Java;

public class Demo14 {
	int a=10;
	void display()
	{
		System.out.println(a++);//10 a=11
		System.out.println(++a);//12 a=12
		System.out.println(++a);//13 a=13
		System.out.println(a--);//13 a=12
		a++;//a=13
		System.out.println(++a);//14 a=14
		System.out.println(--a);//13 a=13
		++a;//a=14
		System.out.println(a--);//14 a=13
		System.out.println(a);//13 a=13
		a--;//a=12
		System.out.println(--a);//11 a=11
		System.out.println(a);//11
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo14 obj=new Demo14();
		obj.display();
	}

}

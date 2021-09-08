package Java;

public class Demo17 {
		int avl_amt=10000;
		void meth1(int withdraw)
		{
			if(withdraw <= 10000)
			{
				System.out.println("transaction success");
			}
			else
			{
				System.out.println("transaction falure");
			}
		}
		void eligbility(int age)
		{
			System.out.println("person age is ==>"+age);
			if(!(age>=18 && age<=35))//not will be altering the output 
			{
				System.out.println("he is eligilble for exam");
			}
			else
			{
				System.out.println("he is not eligible");
			}
		}
	public static void main(String[] args) {
		Demo17 obj=new Demo17();
		obj.meth1(10000);
		System.out.println("====================");
		obj.eligbility(35);

	}

}

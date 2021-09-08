package Java;

public class Demo16 
{

	public static void main(String[] args) 
	{
		int a=34;
		int b=21;
		int c=a++ + ++b; //c=56 a=35 b=22
		int d= --a + --b + c--;//d=111 a=34 b=21 c=55
		int e= a + +b + +c + d--;//e=221 a=34 b=21 c=55 d=109
		int f= -a + b-- + -c - d++;//f=-178 a=34 b=20 c=55 d=110
		int sum=a+b+c+d+e+f;
		System.out.println("sum =" + sum);

	}

}

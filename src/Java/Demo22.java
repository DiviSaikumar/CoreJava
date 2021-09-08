//wrapper classes AutoBoxingand type conversions
package Java;

public class Demo22 {
	void meth1()//autoBoxing
	{
		int x=100;
		byte b=10;
		Byte b1=b;
		Byte b2=new Byte(b);//deprecated
		Byte b3=Byte.valueOf(b);//bes way
		Byte b4=Byte.valueOf((byte)x);//==>Explicit type casting
		System.out.println("===============AutoBoxing=============");
		System.out.println("pdt====>"+b);
		System.out.println("wco===>"+b1);
		System.out.println("wco====>"+b2);
		System.out.println("wco====>"+b3);
		System.out.println("wco====>"+b4);
		int i=101;
		Integer i1=Integer.valueOf(i);
		System.out.println("int pdt====>"+i);
		System.out.println("Integer wco====>"+i1);
		Integer i2=Integer.valueOf(i);//===>Implicit type casting
		System.out.println("Integer wco====>"+i2);
		System.out.println("====================================================");
	}
	void meth2()//AutounBoxing
	{
		Integer i1=new Integer(10);
		int i=i1;
		int i2=i1.intValue();
		Byte b=new Byte((byte)40);
		byte b1=b.byteValue();
		
		Byte b2=new Byte("50");
		byte b3=b2.byteValue();
		
		Character c=new Character('A');
		char c1=c.charValue();
		
		Boolean r=new Boolean("java");
		boolean res=r.booleanValue();
		System.out.println("============AutounBoxing==========");
		System.out.println("integer wco===>"+i1);
		System.out.println("int pdt===>"+i);
		System.out.println("int pdt===>"+i2);
		System.out.println("---------------------------");
		System.out.println("Byte wco===>"+b);
		System.out.println("Byte pdt===>"+b1);
		System.out.println("Byte wco===>"+b2);
		System.out.println("byte pdt====>"+b3);
		System.out.println("---------------------------");
		System.out.println("Character wco==>"+c);
		System.out.println("Character wco==>"+c1);
		System.out.println("---------------------------");
		System.out.println("boolean wco===>"+r);
		System.out.println("Boolean pdt===>"+res);
}

	public static void main(String[] args) {
		Demo22 a=new Demo22();
		a.meth1();
		a.meth2();

	}

}

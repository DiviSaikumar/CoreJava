//program for hashcode,equals,getClass,toString 
package Java;
public class Demo8 {
	int meth1()
	{
		System.out.println("meth 1 is called");
		return 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8 obj1=new Demo8();
		Demo8 obj2=new Demo8();
		System.out.println(obj1.meth1());
		obj2.meth1();
		//hashcode method will return integer values
		System.out.println("hashcode=====>"+obj1.hashCode());
		System.out.println("hashcode====>"+obj2.hashCode());
		//get class method will return the whole package name and class name
		System.out.println("getClass===>"+obj1.getClass());
		//equals method will return the boolean values
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj1));
		String s1=new String("java");
		String s2=new String("java");
		System.out.println("equals=====>"+s1.equals(s2));
		//toStirng method will return string representation of the object
		System.out.println("tostring====>"+obj1.toString());
	}

}

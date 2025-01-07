package pack1;

public class First1 {

	public static void main(String[] args) {
		First1.method1(10);
		First1 obj=new First1();
		obj.method2(15);
	}
	public static void method1(int a)//static method
	{
		System.out.println(a);
	}
	public void method2(int a)//instance method
	{
		System.out.println(a);
	}
	
}

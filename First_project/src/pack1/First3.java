package pack1;

public class First3 {

	public static void main(String[] args) {
		First3 obj=new First3();
		obj.method1(10);
		obj.method1(10,7.8f);
	}
	public void method1(int a)
	{
		System.out.println(a);
	}
	public void method1(int a,float b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}

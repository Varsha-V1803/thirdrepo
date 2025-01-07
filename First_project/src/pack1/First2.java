package pack1;

public class First2 {

	public static void main(String[] args) {
		First2.method1(10);
		First2.method1(5.5f,10);
	}
	public static void method1(int a)
	{
		System.out.println(a);
	}
	public static void method1(float a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}

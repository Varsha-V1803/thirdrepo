package pack1;

public class First4 {

	public static void main(String[] args) {
		First4 obj=new First4(10);
		First4 obj1=new First4(13.3f,9);

	}
	public First4(int a)
	{
		System.out.println(a);
	}
	public First4(float a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

}

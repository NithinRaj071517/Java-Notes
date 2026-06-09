package methods.methodCreationAccess;

public class StaticMethods {

	
	static int a=18;
	public static void name1() 
	{
		System.out.println(a);
	}
	public  void name2() 
	{
		this.a=a++;
		System.out.println(a);
	}
	public  void name3() 
	{
		this.name2();
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		StaticMethods des=new StaticMethods();
		StaticMethods.name1();
		des.name2();
		des.name3();
	}
}

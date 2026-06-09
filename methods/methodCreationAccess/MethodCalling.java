package methods.methodCreationAccess;

public class MethodCalling {

	public  int add() 
	{
		int c=12;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		int a=10,b=20;
		DeclareMethod obj=new DeclareMethod();
		//System.out.println(obj.display());
		int s=obj.display(a,b);
		System.out.println(s);
	}
}

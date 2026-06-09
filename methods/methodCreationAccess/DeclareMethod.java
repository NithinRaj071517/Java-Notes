package methods.methodCreationAccess;



public class DeclareMethod {

	int d=2;
	int a=4;
	
	public  int add() 
	{
		int c=12;
		System.out.println(c);
		return c;
	}
	public  int display(int a, int b) 
	{
		int c=this.a+b+d+add();
		return c;
	}

//	public static void main(String[] args) {
//		int a=10,b=20;
//		DeclareMethod obj=new DeclareMethod();
//		System.out.println(obj.display(a,b));
//		
//	}
}

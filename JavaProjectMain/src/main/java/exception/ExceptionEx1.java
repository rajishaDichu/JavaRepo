package exception;

public class ExceptionEx1 
{

	public static void main(String[] args) 
	{
		int x=20;
		int y=0;
		try 
		{
		int z=x/y;
		//System.out.println("Hi");
		System.out.println(z);
		}
		/*catch(ArithmeticException var)
		{
			x=20;
			y=2;
			int a=x/y;
			System.out.println(a);
			System.out.println(var);
		}
		*/
		finally
		{
			System.out.println("Excecusion Completed!");
		}
	}

}

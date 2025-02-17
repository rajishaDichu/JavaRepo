package exception;

public class ThrowExp 
{
	public static void main(String[] args) 
	{
			int age= 17;
			if(age>=18)
			{
				System.out.println("Eligible");
			}
			else
			{
				throw new ArithmeticException("Not Eligible"); 
			}

		}

}

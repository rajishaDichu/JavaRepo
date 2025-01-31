package string;

public class StringBuilderEx2 
{

	public static void main(String[] args)
	{
		StringBuilder a=new StringBuilder("Welcome");
		a.replace(0, 3, "Hello");
		System.out.println(a);
	}
}

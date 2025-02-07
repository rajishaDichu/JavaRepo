package accessSpecifier;

public class AccessmodifierExample 
{
public void display1()
{
	System.out.println("This is a public method");
}
private void display2()
{
	System.out.println("This is a private method");
}
protected void display3()
{
	System.out.println("This is a protected method");
}
void display4()
{
	System.out.println("This is a void method");
}

	public static void main(String[] args)
	{

		AccessmodifierExample obj=new AccessmodifierExample();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}

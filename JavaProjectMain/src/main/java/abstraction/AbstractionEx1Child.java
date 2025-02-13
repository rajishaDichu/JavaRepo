package abstraction;

public class AbstractionEx1Child extends AbstractionEx1
{

	@Override
	public void display2() 
	{
		System.out.println("This is an abstract method");
		
	}
	public static void main(String[] args) 
	{
		AbstractionEx1Child obj=new AbstractionEx1Child();
		obj.display();
		obj.display2();
	}

}

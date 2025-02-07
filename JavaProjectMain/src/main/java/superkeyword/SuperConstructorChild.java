package superkeyword;

public class SuperConstructorChild extends SuperConstructor
{
public SuperConstructorChild(String name)
{
	super();
	System.out.println(name);
}
	public static void main(String[] args) 
	{
		SuperConstructorChild obj=new SuperConstructorChild("Rajisha");
	

	}

}

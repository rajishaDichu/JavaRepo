package interfacePackage;

public  class InterfacePChild implements InterfaceEx1

{

	public static void main(String[] args)
	{
		InterfacePChild obj=new InterfacePChild();
		obj.display();
	}

	@Override
	public void display() 
	{
		System.out.println("This is an interface");
	}

}

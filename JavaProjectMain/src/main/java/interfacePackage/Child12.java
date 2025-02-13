package interfacePackage;

public class Child12 implements Parent1,Parent2
{

	public static void main(String[] args) 
	{
		Child12 obj=new Child12();
		obj.details("Deekshid");
        obj.details2(5);
	}

	@Override
	public void details2(int age) 
	{
      System.out.println("Age ="+" "+age);
	}

	@Override
	public void details(String name) 
	{
	 System.out.println("Name ="+" "+name);	
	}

}

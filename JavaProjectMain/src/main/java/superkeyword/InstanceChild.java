package superkeyword;

public class InstanceChild extends InstaneParent
{
public void sub(int x,int y)
{
	int z=x-y;
	System.out.println("Difference is "+z);
	super.add(100, 50);
	
}
	public static void main(String[] args) 
	{
		InstanceChild obj=new InstanceChild();
		obj.sub(50, 10);
		
	}

}

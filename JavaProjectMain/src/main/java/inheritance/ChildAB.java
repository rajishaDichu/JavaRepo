package inheritance;

public class ChildAB extends ParentB
{
public void mul()
{
	int s=10;
	int t=3;
	int u=s*t;
	System.out.println("Product is "+u);
	
}
	public static void main(String[] args)
{

		ChildAB obj=new ChildAB();
		obj.mul();
		obj.sub(20, 8);
		obj.add(32, 10);

	}

}

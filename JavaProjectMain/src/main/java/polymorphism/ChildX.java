package polymorphism;

public class ChildX extends ParentX
{
	public void add(int a, int b)
	{
		int c=a-b;
		System.out.println("Result is"+" "+c);
	}
	public static void main(String[] args )
	{
		ParentX obj2=new ParentX();
		obj2.add(100,80);
		ChildX obj1=new ChildX();
		obj1.add(30, 20);
		
	}

}

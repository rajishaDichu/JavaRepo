package inheritance;

public class HChild1 extends HParentA
{
public void sub()
{
	int a=30;
	int b=20;
	int c=a-b;
	System.out.println("Difference is "+c);
}
	public static void main(String[] args)
	{

   HChild1 obj1=new HChild1();
   obj1.sub();
   obj1.add();
   
	}

}

package superkeyword;

public class ChildA extends ParentA

{
	String color="Blue";
public void display()
{
	System.out.println(color);
	System.out.println(super.color);
}
public static void main(String[] args)
{
	ChildA obj1= new ChildA();
	obj1.display();
	
}
}

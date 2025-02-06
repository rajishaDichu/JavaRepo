package inheritance;

public class ChildClass2 extends SingleParent2
{
public void mul()
{
	int x=5;
	int y=4;
	int z=x*y;
	System.out.println(z);
}
public static void main(String[] args) 
{
	ChildClass2 obj1=new ChildClass2();
	obj1.mul();
	obj1.div();
	
}
}


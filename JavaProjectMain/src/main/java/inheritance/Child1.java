package inheritance;

public class Child1 extends Parent1
{
public void sub()
{
int x=20;
int y=10;
int z=x-y;
System.out.println("Difference is "+z);
}
public static void main(String[] args) 
{
	Child1 obj=new Child1();
	obj.sub();
	obj.add(50,60);
}
}
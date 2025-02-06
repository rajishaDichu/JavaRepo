package string;

public class StringBufferEx {

	public static void main(String[] args) 
	{
StringBuffer a= new StringBuffer("Hello");
StringBuffer b=new StringBuffer("Hi Friends!");
StringBuffer c=new StringBuffer("Welcome");

a.insert(1, "Everyone!");
System.out.println(a);
b.replace(0, 2, "Hey");
System.out.println(b);
b.delete(0, 3);
System.out.println(b);
c.append(" Friends!");
System.out.println(c);

	}

}

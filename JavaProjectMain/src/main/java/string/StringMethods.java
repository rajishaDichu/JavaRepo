package string;

public class StringMethods 

{
	public static void main(String args[])
	{
String a="Hello";
String c="hello";
String b="This is a java Program";
String d="hey";
System.out.println(a.charAt(1));
System.out.println(a.length());
System.out.println(a.concat(" Friends!"));
System.out.println(b.contains("This"));
System.out.println(b.contains("Here"));
System.out.println(b.equals(a));
System.out.println(a.equalsIgnoreCase(c));
System.out.println(c.compareTo(d));//answer +ve first string is greater,-ve second string greater,zero means two strings are equal.
	}
}
package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionEx 
{
public static void main(String[] args) 
{
	List <String>obj=new ArrayList<String>();
	obj.add("Rajisha");
	obj.add("Dichu");
	obj.add("Anu");
	obj.add("Manu");
	obj.add("Vichu");
	obj.add("Rajisha");
	System.out.println(obj);
	obj.set(2, "Meenu");//replace the value from index 2 with the new value
	System.out.println(obj);
	System.out.println(obj.indexOf("Rajisha"));
	System.out.println(obj.lastIndexOf("Rajisha"));
	obj.remove(0);//to remove the value from the mentioned index
    System.out.println(obj);
	obj.remove("Vichu");
	System.out.println(obj);
	System.out.println(obj.get(2));//to get the object in the mentioned index
	System.out.println(obj.contains("tree"));//to check whether the list contains the given object

}

}

package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericSample 
{
	public static void main(String[] args) 
	{
		List obj=new ArrayList();
		obj.add("Rajisha");
		obj.add(100);
		obj.add(12.67);
		System.out.println(obj);
}
}
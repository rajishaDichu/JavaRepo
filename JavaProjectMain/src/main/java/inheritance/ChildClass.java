package inheritance;


	public class ChildClass extends SingleParent
	{
		public void sub()
		
		{
			int x=100;
			int y=20;
			int z=x-y;
			System.out.println(z);
		}
		
		public static void main(String[] args) 
		{
	ChildClass obj=new ChildClass();
	obj.add();
	obj.sub();

		}

	}


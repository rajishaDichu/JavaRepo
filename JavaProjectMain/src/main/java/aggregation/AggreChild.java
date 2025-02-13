package aggregation;

public class AggreChild 
{
	String bookname;
	int bookno;
	AggregationSample1 ref;
	public AggreChild(String bookname, int bookno, AggregationSample1 ref)
	{
		this.bookname=bookname;
		this.bookno=bookno;
		this.ref=ref;
		
	
	}
	public void display()
	{
		System.out.println(ref.AuthourID+"  "+ref.authourname);
		System.out.println(bookname+" "+bookno);
	}
	public static void main(String[] args) 
	{
		AggregationSample1 obj1=new AggregationSample1("Rajisha",2019876);
		AggreChild obj2=new AggreChild("Java Notes",112343,obj1);
		obj2.display();
				
		


	}

}

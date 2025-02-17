package exception;

public class CustomException 
{
	
public static void main(String[] args) throws EligibilityException {
			int age= 17;
			if(age>=18)
			{
				System.out.println("Eligible");
			}else
			{
				throw new EligibilityException("Not Eligible"); 
			}

		}

	}


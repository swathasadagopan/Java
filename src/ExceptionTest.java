
public class ExceptionTest {
	static {
		System.out.println("narayana welcomes u");
	}

	public void sum() 
	{
		try
		{
			throw new Exception("narayana loosu");
			//System.out.println("Divide");
			//int m = 9/1;
			
			//System.out.println(m);
		}
//		catch(Exception e)
//		{
//			System.out.println("Exception");
//			e.printStackTrace();
//		}
		catch(ArithmeticException a)
		{ 
			System.out.println("Arithmetic");
			a.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Narayana ");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("In main");
		ExceptionTest e1 = new ExceptionTest();
		e1.sum();
		

	}

}

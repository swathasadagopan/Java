
public class FunctionsTask {

	public static void main(String[] args) {
	
		FunctionsTask a = new FunctionsTask();
		int c =a.add(100, 200);
		System.out.println("Add" + c);
		
		
		String b =a.name("India");
		System.out.println(b);
	

		String c1 =a.name("Australia");
		System.out.println(c1);

	}
	
	public int add(int a, int b)
	{
		int c = a+ b;
		return c;
	}

	public String name(String country)
	{
		if(country.equals("India"))
		{
		return "New Delhi";
		}
		else if(country.equals("Australia"))
		{
			return "Canberra";
		}
		else
		{
			return "Capital not found";
		}

	}
	}

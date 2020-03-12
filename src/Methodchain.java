
public class Methodchain {

	
	public static void m1()
	{
		m2();
	}
	
	public static void m2()
	{
		
		m3();
		
	}
	
	public static void m3()
	{
		m4();
		
	}
	
	public static void m4()
	{
		System.out.println("Byeeeeeeee");
	}
	
	public void ns1() 
	{
		m1();
		m4();
		
		ns2();
	}
	
	public void ns2()
	{
		//this.ns3();
		ns3();
	}
	
	public void ns3()
	{
		System.out.println("Hiiiiiiiiiiiiii");
	}
	public static void main(String[] args) {
		m1();
		Methodchain m = new Methodchain();
		m.ns1();
		m.m2();

	}

}

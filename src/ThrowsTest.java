
public class ThrowsTest {
	
	public void m1() throws Exception
	{
		m2();
	}

	public void m2() throws Exception
	{
		int i=9/0;
		m3();
	}
	
	public void m3()
	{
		System.out.println(("bye"));
	}
	public static void main(String[] args) throws Exception {
		ThrowsTest t = new ThrowsTest();
		t.m1();
		
	

	}

}

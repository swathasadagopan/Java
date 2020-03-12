
public class EncapsulationTest {
	public String empname;
	public int empid;
	private int empsal;
	
	
	
	public EncapsulationTest() {
	
	}

	public EncapsulationTest(String empname, int empid, int empsal) {

		this.empname = empname;
		this.empid = empid;
		this.empsal = empsal;
	}


	public void getname()
	{
		System.out.println("empname");
		getbonus();
		
	}
	
	private void getbonus()
	{
		System.out.println("empbonus yessss happy bonus");
	}
	
	
	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public static void main(String[] args) {
		EncapsulationTest e = new EncapsulationTest();
		e.getname();
		e.getbonus();
		
		EncapsulationTest s = new EncapsulationTest("Jerry",1011,40000);
		System.out.println(s.empname + " " + s.empid + " " + s.empsal);

	}

}

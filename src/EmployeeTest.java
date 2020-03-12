
public class EmployeeTest {
	public String name;
	private int bonus;
	
	public void getempname()
	{
		System.out.println("EmployeeName");
		getbonus();
	}
	
	private void getbonus()
	{
		System.out.println("EmployeeBonus");
	}
	
	public int getEmpbonus()
	{
		return bonus;
	}
	
	public void setEmpbonus(int bonus)
	{
		this.bonus=bonus;
	}
	
	public EmployeeTest(String name,int bonus)
	{
		this.name = name;
		this.bonus=bonus;
	}
	
	public static void main(String[] args) {
		EmployeeTest e = new EmployeeTest("Mithran",200000);
		e.getempname();
		e.getbonus();
		System.out.println(e.name);
		System.out.println(e.bonus);
		

	}

}

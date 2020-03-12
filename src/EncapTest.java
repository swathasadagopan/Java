
public class EncapTest {

	public static void main(String[] args) {
		EncapsulationTest e = new EncapsulationTest("narayana",202,90000);
		System.out.println(e.empname);
		e.setEmpsal(60000);
		e.getname();
		System.out.println(e.getEmpsal());
		
		EmployeeTest e1 = new EmployeeTest("Mridhula",400000);
		e1.getempname();
		System.out.println(e1.name);
		
		e1.setEmpbonus(590000);
		System.out.println(e1.getEmpbonus());
		
	}

}


public class ConstructorTest {
	String empname;
	int empid;
	int empsal;
	
	public ConstructorTest()
	{
		
	}
	
public ConstructorTest(String empname,int empid,int empsal)
{
	this.empname=empname;
	this.empid=empid;
	this.empsal=empsal;
}

	public ConstructorTest(String empname, int empid) {
	super();
	this.empname = empname;
	this.empid = empid;
}

	public static void main(String[] args) {
		ConstructorTest e = new ConstructorTest("Jerry",100,30000);
		System.out.println(e.empname + e.empid + e.empsal);
		ConstructorTest u = new ConstructorTest();
		u.empname="tom";
		u.empid=101;
		u.empsal=20000;
		System.out.println(u.empname);
		ConstructorTest c = new ConstructorTest("Tommy",102);
		System.out.println(c.empname + c.empid);
//		
		

	}

}

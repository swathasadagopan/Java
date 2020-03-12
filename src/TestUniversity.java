
public class TestUniversity {

	public static void main(String[] args) {
	//create object for child classes 
		System.out.println("***Child***");
		System.out.println("");
		Stanford s=new Stanford();
		s.regularclasses();
		s.eveningclasses();
		s.classroom();
		s.playground();
		
		Mit m=new Mit();
		m.regularclasses();
		m.eveningclasses();
		
		Nyu n=new Nyu();
		n.regularclasses();
		n.eveningclasses();	
	//create object for parent classes 
		System.out.println("***Parent***");
		System.out.println("");
		University1 u=new University1();
		u.regularclasses();
		u.eveningclasses();	
	//Top Casting
		System.out.println("***Top Casting***");
		System.out.println("");
		University1 u1 = new Stanford();
		u1.classroom();
		u1.regularclasses();
		u1.eveningclasses();
		u1.playground();
				
	}

}

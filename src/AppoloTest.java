
public class AppoloTest implements USMedical,IndiaMedical {


	@Override
	public void orthoservice() {
		System.out.println("Appolo--ortho India");
		
	}

	@Override
	public void surgeryspecialist() {
		System.out.println("Appolo--surgery India");
		
	}

	@Override
	public void entservice() {
		System.out.println("Appolo--ent US");
		
	}

	@Override
	public void dentalservice() {
		System.out.println("Appolo--Dental US");
	}
	
	public void ambulance() {
		System.out.println("Ambulance");
	}

}

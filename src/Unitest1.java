
public class Unitest1 {

	public static void main(String[] args) {
		University u= new University();
		BrowserTask b=new BrowserTask();
		b.setBrowsername("Opera");
		b.setCurrentversion("9.8");
		b.setVendorname("Google");
		
		
		u.setCountry("India");
		u.setName("Mithran");
		u.setStablishedDate("20-06-2019");
		System.out.println("***University Task***");
		System.out.println(u.getCountry());
		System.out.println(u.getName());
		System.out.println(u.getStablishedDate());
		System.out.println("***BrowserTask***");
		System.out.println(b.getBrowsername());
		System.out.println(b.getCurrentversion());
		System.out.println(b.getVendorname());		

	}

}


public class AbstractTest {

	public static void main(String[] args) {
		LoginTest lp = new LoginTest();
		lp.header();
		lp.title();
		lp.signup();
		LoginTest.signup();
		HomePageTest hp=lp.login("admin","admin");
		lp.logout();
		
	//	HomePageTest hp = new HomePageTest();
		hp.header();
		hp.title();
		hp.userdetails();
		hp.logout();

		
	}

}

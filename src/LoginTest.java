
public class LoginTest extends Page{

	public LoginTest()
	{
		System.out.println("LoginPage Constructor");
	}
	@Override
	public void header() {
		System.out.println("LoginPage--header");
		
	}

	@Override
	public void title() {
		System.out.println("LoginPage--title");
		
	}
	
	public static void signup()
	{
		System.out.println("SignUp");
	}
	
	
	public HomePageTest login(String us, String pswd) {
		System.out.println("Login with " +us + pswd);
		return new HomePageTest();
	}

}

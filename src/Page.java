
public abstract class Page {
	
	public abstract void header();
	public abstract void title();
	
	public final void logout()
	{
		System.out.println("Page--Logout");
	}

	
	public Page()
	{
		System.out.println("Page Constructor");
	}
}

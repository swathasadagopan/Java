import java.util.ArrayList;

public class BrowserTask {
	
	public String browsername;
	 private String vendorname;
	 public String currentversion;
	 private ArrayList<String> plugins;
	
	public String getBrowsername() {
		return browsername;
	}

	public void setBrowsername(String browsername) {
		this.browsername = browsername;
	}
public String getVendorname() {
		return vendorname;
	}

public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

public String getCurrentversion() {
		return currentversion;
	}

public void setCurrentversion(String currentversion) {
		this.currentversion = currentversion;
	}

public ArrayList<String> getPlugins() {
		return plugins;
	}

public void setPlugins(ArrayList<String> plugins) {
		this.plugins = plugins;
	}

	public BrowserTask()
	{
		System.out.println("Default");
	}


	public BrowserTask(String browsername) {
	
		this.browsername = browsername;
	}



	public BrowserTask(String browsername, String currentversion) {
		this.browsername = browsername;
		this.currentversion = currentversion;
	}



	public BrowserTask(String browsername, String vendorname, String currentversion) {

		this.browsername = browsername;
		this.vendorname = vendorname;
		this.currentversion = currentversion;
	}



	public BrowserTask(String browsername, String vendorname, String currentversion, ArrayList<String> plugins) {
		this.browsername = browsername;
		this.vendorname = vendorname;
		this.currentversion = currentversion;
		this.plugins = plugins;
	}



	public static void main(String[] args) {
		ArrayList<String> plugin=new ArrayList<String>();
		plugin.add("jdk");
		plugin.add("jdk 9");
		BrowserTask x =new BrowserTask("Firefox");
		System.out.println("Browser:" + x.browsername);
		BrowserTask a= new BrowserTask("Chrome","9.0");
		System.out.println("Browser:"+a.browsername + " " +a.currentversion);
		
		BrowserTask b= new BrowserTask("Chrome","Google","9.0");
		System.out.println("Browser:"+b.browsername + " " +b.vendorname +" " +b.currentversion);
		
		BrowserTask c=new BrowserTask("IE","Facebook","9.8");
		System.out.println("Browser :" + " " + c.browsername+ " " + "Vendorname:" +" " + c.vendorname + "currentversion:" + " " + c.currentversion+" " + 
		"plugins:" +plugin);
		
	}
}

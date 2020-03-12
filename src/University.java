
import java.util.ArrayList;

public class University {

public	String name;
public	String country;
private	String stablishedDate;
private  ArrayList<String>course;


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getStablishedDate() {
	return stablishedDate;
}

public void setStablishedDate(String stablishedDate) {
	this.stablishedDate = stablishedDate;
}

	

	public University() {
	}

	public University(String name) {
		
		this.name = name;
	}

	public University(String name,String country) {
		this.name=name;
		this.country=country;
	}
		
	public University(String name, String country, String stablishedDate) {
		
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
	}
	
	
	
	public University(String name, String country, String stablishedDate, ArrayList<String> course) {
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.course =course;
	}

	public static void main(String[] args) {
		ArrayList<String> course=new ArrayList<String>();
		course.add("IT");
		course.add("CS");
		course.add("ece");
		
		University u0=new University();
		University u=new University("Mithran");
		University u1=new University("Tom","India");
		University u2=new University("Jerry","US","20-20-2018");
		University u3=new University("Ram","India","01-01-2019");
		System.out.println("0 parameter");
		System.out.println("1 parameter " + u.name);
		System.out.println("2 parameters :" + u1.name + "," + u1.country);
		System.out.println("3 parameters :" + u2.name + "," + u2.country + "," + u2.stablishedDate);
		System.out.println("4 parameters :" + u3.name + "," + u3.country + "," + u3.stablishedDate + "," + course);
		
		

	}

}

public class InheritTest {

	public static void main(String[] args) {
		BmwTest b = new BmwTest();
		b.start();
		b.stop();
		b.autoairsuspension();
		b.refuel();
		
		CarTest c = new CarTest();
		c.start();
		c.stop();
		c.refuel();
		
	
		CarTest c2=new BmwTest();
		c2.start();
		c2.refuel();
		c2.stop();
		
		
		
		BmwTest b2 = (BmwTest)new CarTest();
		b2.autoairsuspension();
		b2.stop();
		
		
		

	}

}

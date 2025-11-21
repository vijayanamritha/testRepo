package sess43.pack;

import org.testng.annotations.*;

public class C3 {
	
	@Test(priority=3)
	void pqr()
	{
		System.out.println("pqr");
	}
    
	@BeforeSuite
	void bs()
	{
		System.out.println("BS");
	}
	
	@AfterSuite
	void AS()
	{
		System.out.println("AS");
	}
}

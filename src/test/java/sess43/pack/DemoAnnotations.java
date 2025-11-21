package sess43.pack;

import org.testng.annotations.*;


public class DemoAnnotations {
	
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
	
	@Test(priority=1)
	void xyz()
	{
	System.out.println("xyz");	
	}
	@BeforeTest
    void bt()
    {
    	System.out.println("BT");
    }
	@AfterTest
	void AT()
	{
		System.out.println("AT");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("BC");
	}
	
	@AfterClass
	void AC()
	{
		System.out.println("ac");
	}
	@BeforeMethod
	void BM()
	{
		System.out.println("BM");
	}
	
	@AfterMethod
	void AM()
	{
		System.out.println("AM");
	}
}


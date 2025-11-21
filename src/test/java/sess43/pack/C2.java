package sess43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
	@Test(priority=1)
	void xyz()
	{
	System.out.println("xyz");	
	}
	@BeforeTest
    void bt1()
    {
    	System.out.println("BT1");
    }
	@AfterTest
	void AT()
	{
		System.out.println("AT");
	}
}

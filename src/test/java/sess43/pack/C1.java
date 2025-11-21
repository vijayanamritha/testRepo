package sess43.pack;

import org.testng.annotations.*;

public class C1 {
	
	@Test(priority=2)
	void abc()
	{
	System.out.println("abc");	
	}
    @BeforeTest
    void bt()
    {
    	System.out.println("bt");
    }
    @AfterTest
    void AT1()
	{
		System.out.println("AT1");
	}
}

package sess43;

import org.testng.annotations.*;

public class ClasslevelAnnotationDemo2 {
	
	@BeforeClass
	void Login()
	{
		System.out.println("Login");
	}
	
	@AfterClass
	void Logout()
	{
		System.out.println("Logout");
	}

	@Test(priority=1)
	void Search()
	{
		System.out.println("Search");
	}
	@Test(priority=2)
	void AdvSearch()
	{
		System.out.println("AdvancedSearch");
	}
	

}

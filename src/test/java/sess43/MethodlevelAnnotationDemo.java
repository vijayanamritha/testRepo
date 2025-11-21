package sess43;

import org.testng.annotations.*;

public class MethodlevelAnnotationDemo {
	
	@BeforeMethod
	void Login()
	{
		System.out.println("Login");
	}
	@Test
	void Search()
	{
		System.out.println("Search");
	}
	@Test
	void AdvSearch()
	{
		System.out.println("AdvancedSearch");
	}
	@AfterMethod
	void Logout()
	{
		System.out.println("Logout");
	}

}

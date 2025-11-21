package sess43;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	
	@Test(priority=1)
	
	void TestSoftAertion()
	{
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Assertion is false");
		sa.assertAll();
	}

}

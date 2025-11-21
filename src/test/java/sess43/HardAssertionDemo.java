package sess43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {

		
		@Test(priority=1)
		void TestTitle()
		{
			String exp_Title="OpenCart";
			String act_Title="OpenDart";
			Assert.assertEquals(exp_Title, act_Title);
		}

	}



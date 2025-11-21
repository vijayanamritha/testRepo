package ses21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoke web browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//Title validation
		String act_Title=driver.getTitle();
		if(act_Title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test case passed");
		}
		
		else
		{
		System.out.println(act_Title);
		System.out.println("Test case failed");	
		}
		
		driver.close();
	}

}

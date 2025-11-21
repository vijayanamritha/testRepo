package sess38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessmodeDEmo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		//Title validation
		String act_Title=driver.getTitle();
		Thread.sleep(5000);
		System.out.println(act_Title);
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

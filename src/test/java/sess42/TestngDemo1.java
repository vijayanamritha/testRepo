package sess42;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngDemo1 {
	
	//Test case
	//1.Open Orange THRM --Launch application
	//2.Check if logo is displayed
	//3.Login
	//4.Close application
	
	WebDriver driver;
	
	@Test(priority=1)
	void Launchapp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	void logo() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean displayed=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(displayed==true)
		{
		System.out.println("logo displayed");
		}
	}
	@Test(priority=3)
    void login()
    {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
	
	@Test (priority=4)
	void closeapp()
	{
		driver.quit();
	}
	
}
;
package Sess27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//Declaration
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(5));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		try
		{
		WebElement element=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
		element.sendKeys("Admin");
		WebElement element1=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		myWait.until(ExpectedConditions.visibilityOf(element1));
		element1.sendKeys("admin123");
		WebElement element2=myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()=\"Login\"]")));
		element2.click();
		}
		catch(Exception e)
		{
			System.out.println("Element not present due to synchronization");
		}
		}
		
		
		
		
	}



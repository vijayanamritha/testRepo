package sess35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDEmo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement Field1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Field1.clear();
		Field1.sendKeys("Welcome");
		
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		//Validate
		//1.Capture field2 and then capture the value of value attribute in field 2 and comapre whether it is equal to "Welcome"
		
		String value=field2.getAttribute("value");
		if(value.equals("Welcome"))
		{
			System.out.println("Tc passed");
		}
		else 
		{
			System.out.println("Tc failed");
		}

	}

}

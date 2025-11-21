package sess37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendKeysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");	
		driver.manage().window().maximize();
		//Send keys() method
		WebElement input=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','John')",input);
		
		//Click() method
		WebElement Rdbtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",Rdbtn);
		
		

	}

}

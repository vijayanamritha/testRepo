package sess22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NamelocatorDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		//using id
		//Locate logo and check if it i displayed or not
		
		boolean logoDisplayed=driver.findElement(By.id("topcartlink")).isDisplayed();
		System.out.println(logoDisplayed);
		//Link Text
		
		driver.findElement(By.linkText("Electronics")).click();
		//Partial Link Text
		
		driver.findElement(By.partialLinkText("App")).click();
		
		//Capture multiple web elements using tagname or classname
		//eg:Capture the header link and count them how many header links
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No of links"+" "+links.size());
		
	}

}

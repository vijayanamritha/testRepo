package sess24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Using single Xpath
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Phone");
		
		//uing 2 attributes
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("Mobile");
		//Using and
		//driver.findElement(By.xpath("//input[@id='small-searchterms'and @placeholder='Search store']")).sendKeys("Mobile");
		//Using Or
		driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='st']")).sendKeys("Mobile");
		
		//Using text() method for inner text
		//boolean status=driver.findElement(By.xpath("//strong[text()='Community poll']")).isDisplayed();
		//System.out.println(status);
		//Print value of element with innertext
		//String text=driver.findElement(By.xpath("//strong[text()='Community poll']")).getText();
		//System.out.println(text);
		
		//driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
		
		//contains() method
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirt");
		//Starts-with() method
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("Tablets");
		//contains and text method
		//boolean ApparelStatus=driver.findElement(By.xpath("//*[contains(text(),'Appar')]")).isDisplayed();
		//System.out.println(ApparelStatus);
		//Replacing text method with .
		driver.findElement(By.xpath("//*[contains(.,'Appar')]")).click();
		
		//Chained Xpath nop commerce logo
		
		boolean LogoIsDisplayed=driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
		System.out.println(LogoIsDisplayed);
		
		
		

	}

}

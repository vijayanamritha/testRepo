package sess36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkOpenInNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Capture Register webelement
		WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		//Open the regster link in new tab by clicking by sing keyboard actions CONTROL+Click(element)
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(register).keyDown(Keys.CONTROL).perform();
		//switch the driver focus to child window
		//getWindowHandles() method always returns set collection of string--->we need the collection of string in list format so that we will have indexing
		List<String> IDs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(IDs.get(1));
		//Capture an element in child window
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John Kennedy");
		//Switch back to home window and capture an element
		driver.switchTo().window(IDs.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirt");
		Thread.sleep(5000);
		driver.close();
	}

}

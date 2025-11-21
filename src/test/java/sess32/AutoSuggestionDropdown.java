package sess32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		//Capture suggestions
		List<WebElement>suggestions=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
		
		

	}

}

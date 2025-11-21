package sess28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		List<WebElement> links= driver.findElements(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//a"));

		System.out.println(links.size());
		
		for(WebElement x:links)
		{
			x.click();
		}
		Set<String>ids=driver.getWindowHandles();
		
		for(String y: ids)
		{
			String title=driver.switchTo().window(y).getTitle();
			System.out.println(title);
			
			if(title.equals("Selenium dioxide - Wikipedia")|| title.equals("Selenium in biology - Wikipedia"))
			{
				driver.close();
			}
		}
		}
	}
	


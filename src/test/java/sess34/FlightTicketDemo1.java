package sess34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightTicketDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		//Select Both
		driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
		//Capture From
		driver.findElement(By.xpath("//form[@id='both_oneway']//div//input[@name='source[]' and @class='suggestion-input required mb-2']")).sendKeys("Delhi");
	    //Capture all auto suggestions from FROM text field when 'Del' is entered
		Thread.sleep(5000);
		List<WebElement> Fromsugg= driver.findElements(By.xpath("//ul[@class='suggestions-list']//li//div[@class='suggestion-block']//div[@class='city']"));
		
		for(WebElement FromS: Fromsugg)
		{
			System.out.println(FromS.getText());
			if(FromS.getText().equals("New Delhi"))
			{
				FromS.click();
				break;
			}
		}
		
		//Capture To
		driver.findElement(By.xpath("//form[@id='both_oneway']//div//input[@name='destination[]' and @class='suggestion-input required mb-2']")).sendKeys("Hong");
		List<WebElement> Tosugg= driver.findElements(By.xpath("//ul[@class='suggestions-list']//li//div[@class='suggestion-block']//div[@class='city']"));
		//mywait.until(ExpectedConditions.textToBePresentInElementLocated( By.xpath("//ul[@class='suggestions-list']//li//div[@class='city']"),"Hong Kong"));
		Thread.sleep(5000);
		for(WebElement ToS: Tosugg)
		{

			if(ToS.getText().equals("Hong Kong"))
			{
				
				ToS.click();
				break;
			}
			
			Thread.sleep(5000);
			
			//Date
			driver.findElement(By.xpath("//input[@placeholder='Departure Date']")).click();
			Thread.sleep(5000);
			List<WebElement>months=driver.findElements(By.xpath("//select[@aria-label='Select month']"));
			System.out.println(months);
			
				    
			
		}

	}

}

package sess37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");	
		driver.manage().window().maximize();
		//Scroll by pixel
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		//Scroll till element is visible
		//1.Capture the element to be visible
		WebElement element= driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		//Scroll till the end of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

	}

}

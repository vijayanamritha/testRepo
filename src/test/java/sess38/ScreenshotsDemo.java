package sess38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");	
		driver.manage().window().maximize();
		//full page screenshots
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);
		//Capture specific area 
		//WebElement featured=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		//File sourcefile1=featured.getScreenshotAs(OutputType.FILE);
		//File targetfile1=new File(System.getProperty("user.dir") +"\\screenshots\\featured.png");
		//sourcefile1.renameTo(targetfile1);
		//Capture screenshot of an element
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile2=logo.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir") + "\\screenshots\\logo.png");
		sourcefile2.renameTo(targetfile2);
		
		
		

	}

}

package sess38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenhotsDemoNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		//full page screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir") + "\\screenshots\\full.png");
		sourcefile.renameTo(targetfile);
		//Specific area
		WebElement products=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile1=products.getScreenshotAs(OutputType.FILE);
		File targetfile1= new File(System.getProperty("user.dir") + "\\screenshots\\product.png");
		sourcefile1.renameTo(targetfile1);
		
		

	}

}

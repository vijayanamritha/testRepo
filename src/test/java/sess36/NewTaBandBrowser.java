package sess36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTaBandBrowser {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//Open new URL in new Tab in the same browser window
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		//Open URL in new broswer window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}

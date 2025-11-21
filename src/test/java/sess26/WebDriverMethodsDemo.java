package sess26;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		System.out.println(driver.getPageSource());
		//Window Handle	
		String WindowHandle=driver.getWindowHandle();
		System.out.println(WindowHandle);
		Thread.sleep(500);
		driver.findElement(By.cssSelector("a[href=\"http://www.orangehrm.com\"]")).click();
		Set<String> Handles=driver.getWindowHandles();
		System.out.println(Handles);
		//Printing each Browser Window ID's
		ArrayList<String> list=new ArrayList<String>(Handles);
		for(String m:list)
		{
			System.out.println(m);
		}
		
		//close and quit
		//driver.close();
		driver.quit();
				 

	}

}

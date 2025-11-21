package sess35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightbutton=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        WebElement copy=driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
        
        Actions act=new Actions(driver);
        act.contextClick(rightbutton).perform();
        Thread.sleep(5000);
        copy.click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
	}

}

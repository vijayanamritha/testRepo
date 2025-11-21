package sess35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement Account=driver.findElement(By.xpath("//*[@id='bank']/li"));
		WebElement Bank=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Bank,Account).perform();
		WebElement value1=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement Amount=driver.findElement(By.xpath("//ol[@id='amt7']"));
		act.dragAndDrop(value1, Amount).perform();

	}

}

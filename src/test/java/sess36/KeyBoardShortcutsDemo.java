package sess36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardShortcutsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyDown(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB);
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		//Three keys
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("a").keyDown(Keys.SHIFT).keyDown(Keys.CONTROL).perform();
		
		
		
		

	}

}

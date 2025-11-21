package sess29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandleUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"alertexamples\"]")).click();
		//Definition will capture the alert element along with that in explicit wait
	    Thread.sleep(500);
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		
		myalert.accept();
		

	}

}

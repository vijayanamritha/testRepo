package sess29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		//Normal Ok alert
		driver.findElement(By.xpath("//input[@id=\"alertexamples\"]")).click();
		Thread.sleep(500);
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		//Confirmation alert
		driver.findElement(By.xpath("//input[@id=\"confirmexample\"]")).click();
		Thread.sleep(500);
		Alert alert1=driver.switchTo().alert();
		//alert1.accept();
		alert1.dismiss();
		//Prompt alert with textbox
		driver.findElement(By.xpath("//input[@id=\"promptexample\"]")).click();
		Thread.sleep(500);
		//driver.switchTo().alert().sendKeys("Welcome"); or
		Alert myalert3=driver.switchTo().alert();
		myalert3.sendKeys("Welcome");
		myalert3.accept();
		

	}

}

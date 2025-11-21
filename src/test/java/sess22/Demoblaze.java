package sess22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		//Get the total number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links"+" "+links.size());
		
		//total number of images
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images"+" "+images.size());
		
		//Click Product link using linkpartial link text
		
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.linkText("Electronics")).click();
		//Scroll webpage
		

	}

}

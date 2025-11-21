package Sess23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDEmo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//tag and id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Tshirt");
		//tag and class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Colour");
		//tag and attribute
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Myshirt");
		//tag , class and attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("YourShirt");
	    Thread.sleep(200);
	    driver.quit();
	    

	}

}

package sess26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//isDispalyed()
		boolean LogoDisplayed=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
        System.out.println(LogoDisplayed);
        //isEnabled
       boolean status= driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).isEnabled();
       System.out.println(status);
       //isSelected
       //Before Selection
       WebElement male=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
       WebElement female=driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
       System.out.println(male.isSelected());
       System.out.println(female.isSelected());
       //After selection
       System.out.println("Male selected");
        male.click();
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());
        System.out.println("Female selected");
        female.click();
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());
	}

}

package sess32;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asssgnment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.blazedemo.com/");
		driver.manage().window().maximize();
		//1.Select depart airport
		WebElement departuredrp=driver.findElement(By.xpath("//select[@name='fromPort']"));
		//Create Select class object
        Select mydep=new Select(departuredrp);
        //Capture all the options and store it in a variable--List collection
        List <WebElement> opt=mydep.getOptions();
        mydep.selectByVisibleText("Paris");
        //2.Select arrival airport
        WebElement arrivaldrp=driver.findElement(By.xpath("//select[@name='toPort']"));
		//Create Select class object
        Select myarr=new Select(arrivaldrp);
        //Capture all the options and store it in a variable--List collection
        myarr.selectByVisibleText("Rome");
        //Click find flights
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        //Next page
        //Number of rows
        int row=driver.findElements(By.xpath("//table[@class='table']//tr")).size();//6 rows including header
        //Create an array of prices to sort and find the lowest price
        Thread.sleep(5000);
        String[] price=new String[row-1];//0,1,2,3,4,5--6 positions
        for(int i=0;i<row-1;i++)
        {
        String price2=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+(i+1)+"]//td[6]")).getText();
        price[i]=price2;     
      
        }
        System.out.println(Arrays.toString(price));
        Arrays.sort(price);
        System.out.println("Lowest Price is"+""+price[0]);
        String lowest=price[0];
        try
        {
        for(int j=0;j<row-1;j++)
        {
        String price2=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+(j+1)+"]//td[6]")).getText();      
        if(price2.equals(lowest))
        {
        	driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+(j+1)+"]//td[1]//input[@class='btn btn-small']")).click();
        }
        
        }
        }
        catch(Exception e)
        {
        System.out.println("There is No such Element exception without reason");
        }
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("India");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Munich");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Bavaria");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("83014");
        //Select dropdown
       WebElement drpdown1= driver.findElement(By.xpath("//select[@id='cardType']"));
        Select CCNumber=new Select(drpdown1);
        CCNumber.selectByVisibleText("Visa");
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("John Smith");
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        Thread.sleep(3000);
       String msg=driver.findElement(By.cssSelector("div[class='container hero-unit'] h1")).getText();
       if(msg.contains("Thank you"))
       {
    	   System.out.println("msg validated");
       }
       else 
       {
    	   System.out.println("msg not valid");
       }
       Thread.sleep(5000);
       driver.quit();
	}
}



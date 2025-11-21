package sess39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		//Find all links in the webpage and store it in a collection of webelements
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//Set an integer type variable to 0 to count the number of broken links
		int NoofBrokenLinks=0;
		//Get each link and get the href attribute value of each link
		try
		{
		for(WebElement URLlink:links)
		{
			String hrefvalue=URLlink.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("Href attribute value is null or empty, so not possible to check");
				continue;//skip that link with no href attribute value
			}
			
			//Convert the URL in string format to URL Format
			URL site = new URL(hrefvalue);
			//Now we need to hit the valid URLS to the server
			//1.Open th connection to the server
			HttpURLConnection conn=(HttpURLConnection)site.openConnection();
			//Connect to the server and send request to the server
			conn.connect();
			//Check if the response code from the server is greater than or equal to 400
			if(conn.getResponseCode()>=400)
			{
				System.out.println("BrokenLinks"+" "+hrefvalue);
				NoofBrokenLinks++;
		    }
			else
			{
				System.out.println("NotBrokenLinks"+hrefvalue);
			}
		
		}
		}
		catch (Exception e)
		{
			
		}
		
		System.out.println("Total number of broken links"+""+NoofBrokenLinks);
	}

}

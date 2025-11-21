package sess32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Count number of rows
		//Approach 1 using xpath when there more than 1 webtable in a webpage
		Integer row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(row);
		//Approach 2-suing tagname when only single webtable exits in the webpage
		int row1=driver.findElements(By.tagName("tr")).size();
		System.out.println(row1);
		//Count number of coloumns--coloumn number based on number of headers <th in first <tr
		//Approach 1 using xpath when there more than 1 webtable in a webpage
		int colm=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println(colm);
		//Approch 2 -tagname
		int colm1=driver.findElements(By.tagName("th")).size();
		System.out.println(colm1);
		//Read data from specific row and table
		WebElement data1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
		System.out.println(data1.getText());
		//Read all the data from the table
		//nested loops-one for row and other for incrementing coloumn
		for(int r=2;r<=row;r++)//first row (<tr) contains header hence index starts from 2
		{
			for(int c=1;c<=colm;c++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
       //Retrieving data based on condition
		//Print bookname whose author is Mukesh
		for(int r=2;r<=row;r++)
		{
		String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		if(author.equals("Mukesh"))
		{
			String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(Bookname);
		}
		}
		//Print total price of all books
		Thread.sleep(5000);
		int total=0;
		for(int d=2;d<=row;d++)
		{
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+d+"]//td[4]")).getText();
		int price1=Integer.parseInt(price);
		total=total+price1;
		}
		System.out.println(total);
		}
	}



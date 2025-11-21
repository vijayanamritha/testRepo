package sess36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//handle minimum slider
		//1.Capture the min slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		Actions act=new Actions(driver);
		//2.Get the location of min_slider
		Point p=min_slider.getLocation();
		//3.Print current location of min_slider
		System.out.println("Location of min_slider before moving"+(min_slider.getLocation()));
		//4.Create Actions class object and use it use drag and DropBy method to drag min_slider
		act.dragAndDropBy(min_slider,100,250).perform();
		System.out.println("Location of min_slider after moving"+(min_slider.getLocation()));
		//1.Capture the max slider
		WebElement max_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		//2.Get the location of min_slider
		//3.Print current location of max_slider
		System.out.println("Location of max_slider before moving"+(max_slider.getLocation()));
		//4.Create Actions class object and use it use drag and DropBy method to drag max_slider
		act.dragAndDropBy(max_slider,-100,250).perform();
		System.out.println("Location of min_slider after moving"+(max_slider.getLocation()));

	}

}

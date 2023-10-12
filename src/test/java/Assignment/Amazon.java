package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

//entering the url
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath()).sendKeys("mobile");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Actions a = new Actions(driver);
		a.contextClick(search).perform();
		search.sendKeys("mobiles");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 String parent = driver.getWindowHandle();
		System.out.println("parent window:"+parent);
		Set<String> child = driver.getWindowHandles();
		for(String b:child){
			driver.switchTo().window(b);
		}
		 WebElement price = driver.findElement(By.xpath("//span[text()='OnePlus 11R 5G (Galactic Silver, 8GB RAM, 128GB Storage)']/../../../../../..//span[@class='a-price-whole']"));
		System.out.println(price.getText());
	}
}
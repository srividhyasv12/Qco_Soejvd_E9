package Pop_Ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser_Popup {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
				driver.manage().window().maximize();
				

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
//entering the url
				driver.get("https://skillrary.com/");
				String parent = driver.getWindowHandle();
				System.out.println(parent);
				driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
				driver.findElement(By.xpath("(//a[text()='  SkillRary Essay '])[2]")).click();
				 Set<String> child = driver.getWindowHandles();
				 for(String b:child) {
					 System.out.println(b);
					 driver.switchTo().window(b);
				 }
				 driver.findElement(By.id("mytext")).sendKeys("Srividhya");
				 Thread.sleep(3000);
				 driver.switchTo().window(parent);
				 driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
}
}
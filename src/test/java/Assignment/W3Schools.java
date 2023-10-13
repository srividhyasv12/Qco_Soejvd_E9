package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schools {
	public static void main(String[] args) throws Throwable {
		
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
	Thread.sleep(3000);
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
}
}
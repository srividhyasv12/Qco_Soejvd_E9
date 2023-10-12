package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
@DataProvider
public Object[] [] getData(){
	Object [] [] a=new Object[3] [2];
	a[0] [0]="sri";
	a[0] [1]="vidhya";
	
	a[1] [0]="sanaju";
	a[1] [1]="sharu";
	
	a[2] [0]="rajesh";
	a[2] [1]="kumar";
	
	return a;
}
@Test(dataProvider="getData")
public void Facebook(String data,String data1) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	//maximize the browser
			driver.manage().window().maximize();
			

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
//entering the url
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("data");
			driver.findElement(By.id("pass")).sendKeys("data1");
}
}

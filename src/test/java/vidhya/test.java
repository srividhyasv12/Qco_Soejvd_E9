package vidhya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class test {
public static void main(String[] args) throws Throwable {
	

	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajes\\eclipse-workspace\\Qco_Soejvd_E9\\src\\main\\resources\\chromedriver (1).exe");
	Thread.sleep(3000);
			WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
			

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
//entering the url
			driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_1_2_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=mobiles&requestId=099fb185-17b6-45a1-95ec-b1eaa270a2f9&as-backfill=on");
			driver.get("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../../../../../../.././/div[@class='_30jeq3 _1_WHN1']");
}}
////p[text()='6E 2112']/../../../..//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice']===>for makemytrip xpath traversing https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-08/10/2023&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng&cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded| 
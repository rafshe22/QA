package TestNGPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GgoogleVisit {
	
	WebDriver ALL;
  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver2.exe");
		ChromeDriver ALL = new ChromeDriver();
		ALL.get("https://www.google.com/");
		
		Thread.sleep(6000);
		ALL.close();
		
	  
	  
	  
	  
	  
  }
}

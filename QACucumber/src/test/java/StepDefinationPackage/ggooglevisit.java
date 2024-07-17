package StepDefinationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class ggooglevisit {
	
	
	WebDriver ALL;
	
	
	@Given("{string}")
	public void string(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver2.exe");
		ChromeDriver ALL = new ChromeDriver();
		ALL.get("https://www.google.com/");
		
		
		
		
	}
	

}

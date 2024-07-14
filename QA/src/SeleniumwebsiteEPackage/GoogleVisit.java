package SeleniumwebsiteEPackage;



import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleVisit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver2.exe");
		ChromeDriver ALL = new ChromeDriver();
		ALL.get("https://www.google.com/");
		
		Thread.sleep(6000);
		ALL.close();
		
	}

}

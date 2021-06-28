import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create driver object
		// implement methods of webdriver

		System.setProperty("webdriver.chrome.driver", "/Users/deepthyjayaraj/automation/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/"); // hit url
		System.out.println(driver.getTitle()); // validate the page Title
		System.out.println(driver.getCurrentUrl()); // validate the landed url
		driver.get("https://www.yahoo.com/");
		driver.navigate().back(); // navigate backward
		driver.navigate().forward(); // navigate forward
		driver.close();// to close the browser
		driver.quit(); // to close all the browsers opened by Selenium script
		

	}

}

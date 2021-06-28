import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/deepthyjayaraj/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("toys");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

//#nav-search-submit-button
// #twotabsearchtextbox
	}

}

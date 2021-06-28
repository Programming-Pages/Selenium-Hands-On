import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssregularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/deepthyjayaraj/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("input[id*='twotabsearchtextbox']")).sendKeys("toys");
		driver.findElement(By.cssSelector("input[id*='nav-search-submit-button']")).click();

		/*
		 * css Regular Expression Syntax
		 * 
		 * tagName[atribube*='Value']
		 * 
		 * #twotabsearchtextbox input[id*='twotabsearchtextbox']
		 * 
		 * 
		 * #nav-search-submit-button input[id*='nav-search-submit-button']
		 */

	}

}

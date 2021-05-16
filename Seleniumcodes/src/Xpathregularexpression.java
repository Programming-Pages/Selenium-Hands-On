import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathregularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "/Users/deepthyjayaraj/automation/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Toys");
	driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
	

	
	// xpath copied for finding text box to search
	//driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("toys");
	// xpath copied for clicking submit button
	////*[@id="nav-search-submit-button"]
	//input[contains(@id,'nav-search-submit-button')]
	
	
	
		
	/* xpath
	 tagName[contains(@atribute='Value']	
	 input[contains(@id='twotabsearchtextbox')]
	 */
		
		
		
		
		
	}

}

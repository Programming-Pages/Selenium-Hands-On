import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csscustomized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/deepthyjayaraj/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("user name");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		 /*
		 * [atribute='Value'] OR tagName[atribute='Value'] #username id='username']
		 * input[id='password']
		 * 
		 * //*[@id="Login"]
		 */

	}

}

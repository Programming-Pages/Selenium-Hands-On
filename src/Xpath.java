import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/deepthyjayaraj/automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@name=\'login']")).click();
		
		
		//driver.findElements(By.xpath("//*[@id=\'email\']"));
		
		
		
		
		
		

//  //*[@id="u_0_d_1a"] --- xpath copied from browser , 
// //*[@id="u_0_d_1a"] --- "" -> ''  this Xpath is not working 
		// add name ="login" insted of //*[@id="u_0_d_1a"]
		
	}

}

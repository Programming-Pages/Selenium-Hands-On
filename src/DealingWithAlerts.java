import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String text ="MyName";
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(1000);
		// Alert with 'ok' button only
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// Alert with 'ok' and 'cancel' buttons
		Thread.sleep(1000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
        driver.close();
        driver.quit();
	}

}

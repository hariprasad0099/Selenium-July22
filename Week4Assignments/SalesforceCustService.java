package week4.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCustService {

	public static void main(String[] args) throws InterruptedException {
		
		
//		1.Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
	
		
//		2.Load the url as " https://login.salesforce.com/ "
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		3.Enter the username as " ramkumar.ramaiah@testleaf.com "
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
//		4. Enter the password as " Password$123 "
		driver.findElement(By.id("password")).sendKeys("Password$123");
		
//		5.click on the login button
		driver.findElement(By.id("Login")).click();
		Thread.sleep(10000);
	
		
//		6.click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
//		7.Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandleslst = new ArrayList<String>(windowHandles);
		String w1 = windowHandleslst.get(0);
		String w2 = windowHandleslst.get(1);
		driver.switchTo().window(w2);
		
//		8.click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
//		9.Get the title
		System.out.println(driver.getTitle());
		
//		10.Get back to the parent window
		driver.switchTo().window(w1);
		
//		11.close the browser
		driver.close();
	}

}

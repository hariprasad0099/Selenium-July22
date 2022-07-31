package week4.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContacts {

	public static void main(String[] args) throws InterruptedException {

//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

//		 * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

//		 * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

//		 * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

//		 * 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();

//		 * 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		Thread.sleep(5000);

//		 * 7. Click on Widget of From Contact
		driver.findElement(By.xpath("(//span[text()='From Contact']/following::img)")).click();

//		 * 8. Click on First Resulting Contact
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windowHandleslist = new ArrayList<String>(windowHandles);
		String window2 = windowHandleslist.get(1);
		String window1 = windowHandleslist.get(0);	
		driver.switchTo().window(window2);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		Thread.sleep(2000);

//		 * 9. Click on Widget of To Contact
		driver.switchTo().window(window1);
		driver.findElement(By.xpath("(//span[text()='To Contact']/following::a/img)[1]")).click();
		//Thread.sleep(2000);

//		 * 10. Click on Second Resulting Contact
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String>windowHandles3list = new ArrayList<String>(windowHandles3);
		String window3 = windowHandles3list.get(1);
		driver.switchTo().window(window3);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		Thread.sleep(2000);

//		 * 11. Click on Merge button using Xpath Locator
		driver.switchTo().window(window1);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(2000);

//		 * 12. Accept the Alert
		driver.switchTo().alert().accept();

//		 * 13. Verify the title of the page
		System.out.println(driver.getTitle());;

	}

}

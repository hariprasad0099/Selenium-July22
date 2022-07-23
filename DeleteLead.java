package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
//		*http://leaftaps.com/opentaps/control/main
//		
//		* 1	Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   //(30, TimeUnit.SECONDS);

		
//		* 2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

//		* 3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		
//		* 4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

//		* 5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();

//		* 6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();

//		* 7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
			
//		8	Click on Phone
		driver.findElement(By.xpath("//span[text() ='Phone']")).click();
		
//		Thread.sleep(2000);
		
//		9	Enter phone number
		//driver.findElement(By.xpath("input[name='phoneNumber']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("987654321");
		
//		Thread.sleep(5000);
				
//		10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
				
//		11	Capture lead ID of First Resulting lead
		String FirstResultingLeadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		System.out.println(FirstResultingLeadId);
				
//		12	Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
			
//		13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
		
//		14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
//		15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(FirstResultingLeadId);
		
//		16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String messageDisplayed = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		if (messageDisplayed.equalsIgnoreCase("No records to display")) {
			System.out.println("Expected text present");
			}
		else {
			System.out.println("not displayed");
		}
	
//		18	Close the browser (Do not log out)
		//driver.close()


	}

}

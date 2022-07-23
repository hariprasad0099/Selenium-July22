package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		*http://leaftaps.com/opentaps/control/main
//		
//		* 1	Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
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
		
//		* 8	Enter first name
		//input[@name ='firstName']
		driver.findElement(By.xpath("(//label[text() ='First name:'])[3]/parent :: div//input")).sendKeys("Hari");
		
//		* 9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
//		* 10 Click on first resulting lead
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first')]//a")).click();
		
//		* 11 Verify title of the page
		String title = driver.getTitle();
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println(title);	
		}

		Thread.sleep(2000);
		
//		* 12 Click Edit
			driver.findElement(By.linkText("Edit")).click();
			
		Thread.sleep(2000);
		
//		* 13 Change the company name
			//input[@name='companyName' and @class='inputBox']
			String newName = "GOOGLE1";
			driver.findElement(By.xpath("//input[@name='companyName' and @class='inputBox']")).clear();
			driver.findElement(By.xpath("//input[@name='companyName' and @class='inputBox']")).sendKeys(newName);
//		* 14 Click Update
			 driver.findElement(By.xpath("//input[@value='Update']")).click();
			

					
//		* 15 Confirm the changed name appears
			 String changedName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				if(changedName.contains(newName)) {
					System.out.println("The new name is changed");
				}
				else
					System.out.println("Not updated");
			
//		* 16 Close the browser (Do not log out)
				//driver.close();

	}


}




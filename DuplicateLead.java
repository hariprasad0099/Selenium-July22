package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Assignment 2:Duplicate Lead
//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

//4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

//6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();

//7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");

//8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");

//9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aru");

//10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Remya");

//11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Ops");

//12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.name("description")).sendKeys("Btech Graduate");

//13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mhariprasad0099@gmail.com");

//14. Select State/Province as NewYork Using Visible Text
		WebElement DropdownCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select option = new Select(DropdownCurrency);
		option.selectByVisibleText("USD - American Dollar");
//15. Click on Create Button
		WebElement submitbutton = driver.findElement(By.name("submitButton"));
		String buttonlabel = submitbutton.getAttribute("value");
		if(buttonlabel.equals("Create Lead")) {
			submitbutton.click();
		}
				
//16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		System.out.println(driver.getTitle());
//17. Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
//18. Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ADC");
//19.Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mr.H");

//20.Click on Create Lead Button
		WebElement submitButtonDuplicatelead = driver.findElement(By.className("smallSubmit"));
		String submitButtonDuplicateleadLabel = submitButtonDuplicatelead.getAttribute("value");
		if(submitButtonDuplicateleadLabel.equals("Create Lead")) {
			submitButtonDuplicatelead.click();
		}
//21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		System.out.println(driver.getTitle());

	}
}

package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignment:1
		//FaceBook:
		//================================
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();;
		
		// Step 2: Launch the chromebrowser
		WebDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/"); //u_3_b_Ts
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   //(30, TimeUnit.SECONDS);
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Mickey");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Mouse");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9876543210");
		
		// Step 10: Enter the password
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Comms@123");
		
		// Step 11: Handle all the three drop downs
		WebElement birthdaydropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date = new Select(birthdaydropdown);
		date.selectByValue("20");
		
		WebElement birthdaymonthdropdown = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(birthdaymonthdropdown);
		month.selectByVisibleText("Aug");
		
		WebElement birthdayyeardropdown = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select varsham = new Select(birthdayyeardropdown);
		varsham.selectByValue("1993");				
		
		// Step 12: Select the radio button "male" 
		// (A normal click will do for this step)
		driver.findElement(By.xpath("//label[text() ='Male']")).click();
		
		//Click the sign up button
		driver.findElement(By.xpath("//button[@type='submit' and contains(text(),'Sign Up')]")).click();


	}

}

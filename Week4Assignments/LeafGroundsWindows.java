package week4.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundsWindows {

	public static void main(String[] args) {
		//Launch URL http://www.leafground.com/pages/Window.html
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/Window.html");
		
		// Click button to open home page in New Window
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandleslst = new ArrayList<String>(windowHandles);
		String w1 = windowHandleslst.get(0);
		System.out.println("Windw Handle of W1 is   :"+w1);
		driver.close();
		String w2 = windowHandleslst.get(1);
		driver.switchTo().window(w2);
		driver.getTitle();
		driver.findElement(By.xpath("//h5[text()='Window']")).click();
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();

		
		// Find the number of opened windows
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>windowHandles2lst = new ArrayList<String>(windowHandles2);
		System.out.println(windowHandles2lst);
		int noOfActiveWindows = windowHandles2lst.size();
		System.out.println("No of active windows are  " +noOfActiveWindows );
		
		String win1 = windowHandles2lst.get(0);
		String win2 = windowHandles2lst.get(1);
		String win3 = windowHandles2lst.get(2);
		
		System.out.println(win1 + " ,"+ win2 +" ," + win3);
		
	
	}

}

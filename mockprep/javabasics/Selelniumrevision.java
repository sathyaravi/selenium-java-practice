package mockprep.javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selelniumrevision {

	public static void main(String[] args) {
		
		//Instantiating and launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Use get() method to open the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//manage() - to manage the window options like maximize it
		
		driver.manage().window().maximize();
		
		//Using different types of locators to locate the element in the application
		
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		driver.close();
		

	}

}

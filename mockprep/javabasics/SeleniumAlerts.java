package mockprep.javabasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlerts {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//h5[contains(text(),' Alert (Simple Dialog)')]/following-sibling::button")).click();
		
		//Handling alerts 
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		driver.findElement(By.xpath("//h5[contains(text(),' Alert (Confirm Dialog)')]/following-sibling::button")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		alert2.dismiss();

	}

}

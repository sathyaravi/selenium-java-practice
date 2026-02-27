package mockprep.javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUserInteractions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		//webdriver methods,handle windows
		
		driver.findElement(By.xpath("//span[text()='Open']/parent::button")).click();
		
		Set<String> windowList = driver.getWindowHandles();
		
		System.out.println(windowList);
		
		List <String> newWindow = new ArrayList<String>(windowList);
		 
		System.out.println(newWindow);
		
		String parentWindow = newWindow.get(0);
		
		
		//String childWindow = newWindow.get(1);
		
		
		driver.switchTo().window(parentWindow);

		
		
		
		driver.close();
	}

}

package mockprep.javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDragandDrop {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/drag.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		

	}

}

package oopsconcepts;

public class BrowserManager {

	public static void main(String[] args) {
		BrowserDriver driver = BrowserFactory.getDriver("edge");
		driver.chooseDriver();
		driver.openDriver();
	}

}

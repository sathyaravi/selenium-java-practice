package oopsconcepts;
public class BrowserFactory {

    public static BrowserDriver getDriver(String browser) {

        if(browser.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        }
        else {
            return null;
        }
    }
}
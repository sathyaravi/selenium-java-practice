package oopsconcepts;

public class FirefoxDriver implements BrowserDriver {

		@Override
		public void chooseDriver() {
			System.out.println("Firefox Driver is Selected");
		}

		@Override
		public void openDriver() {
			System.out.println("Open Firefox browser");
			
		}

		@Override
		public void closeDriver() {
			System.out.println("Close Firefox browser");
			
		}
}

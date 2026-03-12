package oopsconcepts;

public class ChromeDriver implements BrowserDriver {

		@Override
		public void chooseDriver() {
			
			System.out.println("Chrome Driver is Selected");
			
		}

		@Override
		public void openDriver() {
			System.out.println("Open Chrome browser");
			
		}

		@Override
		public void closeDriver() {
			System.out.println("Close Chrome browser");
			
		}
}

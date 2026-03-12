package oopsconcepts;

public class EdgeDriver implements BrowserDriver{
	
	
	@Override
	public void chooseDriver() {
		System.out.println("Edge Driver is Selected");
		
	}

	@Override
	public void openDriver() {
		System.out.println("Open Edge browser");
		
	}

	@Override
	public void closeDriver() {
		System.out.println("Close Edge browser");
		
	}

}

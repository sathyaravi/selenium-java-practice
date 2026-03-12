package oopsconcepts;

public class PushNotification extends NotificationManager {
	
	@Override
	void enableNotification() {
		
		super.enableNotification();
		
		System.out.println("Push notifications enabled");
	}

}

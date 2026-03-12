package oopsconcepts;

public class NotificationSystem {

	public static void main(String[] args) {
		
		NotificationManager nObj;
		
		nObj = new EmailNotification();
		nObj.enableNotification();
		
		nObj = new SMSNotification();
		nObj.enableNotification();
		
		
		nObj = new PushNotification();
		nObj.enableNotification();
		
		
		
	}

}
